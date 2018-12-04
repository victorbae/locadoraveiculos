package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import model.Funcionario;
import model.Veiculo;

public class testVeiculo {
	Date data = new Date();
	Funcionario funcionario = new Funcionario();
	Veiculo veiculo = new Veiculo(1, "Teste Placa", data, "Teste Cor", "Teste Modelo", "Teste Fabricante",
			"Teste Estado", funcionario, "Teste Status");

	@Test
	public void testGetVeiculo() {
		assertTrue(veiculo.getAnofabricacao() == data);
		assertTrue(veiculo.getCodigoveiculo() == 1);
		assertTrue(veiculo.getCor() == "Teste Cor");
		assertTrue(veiculo.getEstado() == "Teste Estado");
		assertTrue(veiculo.getFabricante() == "Teste Fabricante");
		assertTrue(veiculo.getModelo() == "Teste Modelo");
		assertTrue(veiculo.getPlaca() == "Teste Placa");
		assertTrue(veiculo.getProprietario().equals(funcionario));
		assertTrue(veiculo.getStatus() == "Teste Status");
	}

	@Test
	public void testSetVeiculo() {
		Date data2 = new Date();
		Funcionario funcionario2 = new Funcionario();
		veiculo.setAnofabricacao(data2);
		veiculo.setCodigoveiculo(2);
		veiculo.setCor("Teste Cor 2");
		veiculo.setEstado("Teste Estado 2");
		veiculo.setFabricante("Teste Fabricante 2");
		veiculo.setModelo("Teste Modelo 2");
		veiculo.setPlaca("Teste Placa 2");
		veiculo.setProprietario(funcionario2);
		veiculo.setStatus("Teste Status 2");

		assertFalse(veiculo.getAnofabricacao() == data);
		assertFalse(veiculo.getCodigoveiculo() == 1);
		assertFalse(veiculo.getCor() == "Teste Cor");
		assertFalse(veiculo.getEstado() == "Teste Estado");
		assertFalse(veiculo.getFabricante() == "Teste Fabricante");
		assertFalse(veiculo.getModelo() == "Teste Modelo");
		assertFalse(veiculo.getPlaca() == "Teste Placa");
		assertFalse(veiculo.getProprietario().equals(funcionario));
		assertFalse(veiculo.getStatus() == "Teste Status");

	}
}