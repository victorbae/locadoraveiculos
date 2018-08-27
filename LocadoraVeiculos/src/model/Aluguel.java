package model;

import java.io.Serializable;
import java.util.Date;

public class Aluguel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6153034172273083255L;
	private Integer codigoaluguel;
	private Cliente locatario;
	private Veiculo carroalugado;
	private Date datainicio;
	private Date datafim;
	private String situacao;
	private Double valortotal;

	public Aluguel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluguel(Integer codigoaluguel, Cliente locatario, Veiculo carroalugado, Date datainicio, Date datafim,
			String situacao, Double valortotal) {
		super();
		this.codigoaluguel = codigoaluguel;
		this.locatario = locatario;
		this.carroalugado = carroalugado;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.situacao = situacao;
		this.valortotal = valortotal;
	}

	public Integer getCodigoaluguel() {
		return codigoaluguel;
	}

	public void setCodigoaluguel(Integer codigoaluguel) {
		this.codigoaluguel = codigoaluguel;
	}

	public Cliente getLocatario() {
		return locatario;
	}

	public void setLocatario(Cliente locatario) {
		this.locatario = locatario;
	}

	public Veiculo getCarroalugado() {
		return carroalugado;
	}

	public void setCarroalugado(Veiculo carroalugado) {
		this.carroalugado = carroalugado;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getDatafim() {
		return datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Double getValortotal() {
		return valortotal;
	}

	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
