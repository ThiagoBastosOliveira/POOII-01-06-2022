package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Automovel;
import entities.Modelo;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividadeJpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
		Query query1 = em.createQuery("SELECT a FROM Automovel a");
		List<Automovel> automoveis = query1.getResultList();
		
		for(Automovel a : automoveis) {
			System.out.println("=== " + a.getAnoFabricacao() + " ===");
			
			for(Modelo md : a.getModelo()) {
				System.out.println("=== " + md.getDescricao() + " ===");
			}
		}
		
		em.close();
		emf.close();
	}

}
