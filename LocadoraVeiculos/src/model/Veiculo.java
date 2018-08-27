package model;

import java.io.Serializable;
import java.util.Date;

public class Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8589380392259643361L;
	private Integer codigoveiculo;
	private String placa;
	private Date anofabricacao;
	private String cor;
	private String modelo;
	private String fabricante;
	private String estado;
	private Funcionario proprietario;
	private String status;

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(Integer codigoveiculo, String placa, Date anofabricacao, String cor, String modelo,
			String fabricante, String estado, Funcionario proprietario, String status) {
		super();
		this.codigoveiculo = codigoveiculo;
		this.placa = placa;
		this.anofabricacao = anofabricacao;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.estado = estado;
		this.proprietario = proprietario;
		this.status = status;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getAnofabricacao() {
		return anofabricacao;
	}

	public void setAnofabricacao(Date anofabricacao) {
		this.anofabricacao = anofabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Funcionario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Funcionario proprietario) {
		this.proprietario = proprietario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCodigoveiculo() {
		return codigoveiculo;
	}

	public void setCodigoveiculo(Integer codigoveiculo) {
		this.codigoveiculo = codigoveiculo;
	}

}
