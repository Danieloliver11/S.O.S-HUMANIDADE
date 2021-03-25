package com.example.ACSocioambiental.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name= "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max =30)
	public String nome;
	
	@NotNull
	private double preco;
	
	@NotNull
	@Size(max= 100)
	private String descricao;
	
	@NotNull
	@URL
	private String imagens;
	
	@NotNull
	private int qtProduto;
	
	@NotNull
	private boolean produtoAtivo ;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto") // se der erro foi aqui
	private Categoria categoria;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getImagens() {
		return imagens;
	}


	public void setImagens(String imagens) {
		this.imagens = imagens;
	}


	public int getQtProduto() {
		return qtProduto;
	}


	public void setQtProduto(int qtProduto) {
		this.qtProduto = qtProduto;
	}


	public boolean isProdutoAtivo() {
		return produtoAtivo;
	}


	public void setProdutoAtivo(boolean produtoAtivo) {
		this.produtoAtivo = produtoAtivo;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
	
	
	
	
	
	
}
