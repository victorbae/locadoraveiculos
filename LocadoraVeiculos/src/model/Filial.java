package model;

import java.io.Serializable;

public class Filial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6536586533036716306L;
	private Integer codigoFilial;
	private String nomefilial;
	private String cidade;
	private String endereco;
	private String telefone;

	public Filial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filial(Integer codigoFilial, String nomefilial, String cidade, String endereco, String telefone) {
		super();
		this.codigoFilial = codigoFilial;
		this.nomefilial = nomefilial;
		this.cidade = cidade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Integer getCodigoFilial() {
		return codigoFilial;
	}

	public void setCodigoFilial(Integer codigoFilial) {
		this.codigoFilial = codigoFilial;
	}

	public String getNomefilial() {
		return nomefilial;
	}

	public void setNomefilial(String nomefilial) {
		this.nomefilial = nomefilial;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
