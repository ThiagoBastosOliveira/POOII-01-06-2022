package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Automovel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int anoFabricacao;
	private int anoModelo;
	private String observacoes;
	private float preco;
	private int kilometragem;
	
	@OneToOne
	@JoinColumn(name = "modelo_id")
	private Modelo modelo;
	
	public Automovel() {
		
	}
	
	public Automovel(int id, int anoFabricacao, String observacoes, float preco, int kilometragem) {
		this.id = id;
		this.anoFabricacao = anoFabricacao;
		this.observacoes = observacoes;
		this.preco = preco;
		this.kilometragem = kilometragem;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getKilometragem() {
		return kilometragem;
	}
	
	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}	
	
}
