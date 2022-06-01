package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Modelo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "automovel")
	private List<Automovel> listaAutomovel;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descricao;
	private int potencia;
	
	@OneToOne
	@JoinColumn(name = "marca_id")
	private Marca marca;
	
	public Modelo() {
		
	}
	
	public Modelo(int id, String descricao, int potencia) {
		this.id = id;
		this.descricao = descricao;
		this.potencia = potencia;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void addAutomovel(Automovel a) {
		
		if(a != null && !listaAutomovel.contains(a)) {
			listaAutomovel.add(a);
		}
	}
	
	public void removeAutomovel(Automovel a) {
		
		if(a != null && listaAutomovel.contains(a) && listaAutomovel.size() > 1) {
			listaAutomovel.remove(a);
		}
	}
	
}
