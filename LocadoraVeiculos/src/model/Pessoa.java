package model;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 802743012722393670L;
	private String nome;
	private String cpf;
	private String rg;
	private String cnh;
	private int idade;
	private String telefone;
	private String email;
	private String endereco;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, String rg, String cnh, int idade, String telefone, String email,
			String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cnh = cnh;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
