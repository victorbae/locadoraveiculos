package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Funcionario extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6308855475245876098L;
	private Integer codigoFuncionario;
	private String cargo;
	private Filial filial;

	public Funcionario(String cargo, Integer codigoFuncionario, Filial filial) {
		super();
		this.cargo = cargo;
		this.codigoFuncionario = codigoFuncionario;
		this.filial = filial;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String cpf, String rg, String cnh, LocalDate datanascimento, String telefone,
			String email, String endereco) {
		super(nome, cpf, rg, cnh, datanascimento, telefone, email, endereco);
		// TODO Auto-generated constructor stub
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Integer codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	@Override
	public String toString() {
		return getNome();
	}

}
