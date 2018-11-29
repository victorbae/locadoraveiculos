package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Cliente extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7554162623351147822L;
	private Integer codigoCliente;

	public Cliente(Integer codigoCliente) {
		super();
		this.codigoCliente = codigoCliente;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String cpf, String rg, String cnh, LocalDate datanascimento, String telefone,
			String email, String endereco) {
		super(nome, cpf, rg, cnh, datanascimento, telefone, email, endereco);
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}
