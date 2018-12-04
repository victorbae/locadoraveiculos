package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import model.Aluguel;
import model.Cliente;
import model.Filial;
import model.Funcionario;
import model.Veiculo;

public class testAluguel {
	Date data = new Date();
	Filial filial = new Filial(1, "Teste Nome", "Teste Cidade", "Teste End", "Teste Telefone");
	Cliente cliente = new Cliente("Teste Nome", "Teste CPF", "Teste RG", "Teste CNH", 19, "Teste Telefone",
			"teste@teste", "Teste Endereco");
	Funcionario funcionario = new Funcionario("Teste Cargo", 1, filial);
	Veiculo veiculo = new Veiculo(1, "Teste Placa", data, "Teste Cor", "Teste Modelo", "Teste Fabricante",
			"Teste Estado", funcionario, "Teste Status");
	Aluguel aluguel = new Aluguel(1, cliente, veiculo, data, data, "Tudo ok!", (Double) 80.0);

	@Test
	public void testGetAluguel() {
		assertTrue(aluguel.getCodigoaluguel() == 1);
		assertTrue(aluguel.getDatafim() == data);
		assertTrue(aluguel.getDatainicio() == data);
		assertTrue(aluguel.getSituacao() == "Tudo ok!");
		assertTrue(aluguel.getValortotal() == 80.0);
		assertTrue(aluguel.getLocatario().equals(cliente));
		assertTrue(aluguel.getCarroalugado().equals(veiculo));
	}

	@Test
	public void testSetAluguel() throws Exception {
		Date data2 = new Date();
		Cliente cliente2 = new Cliente("Teste Nome 2", "Teste CPF 2", "Teste RG 2", "Teste CNH 2", 20,
				"Teste Telefone 2", "teste2@teste2", "Teste Endereco 2");
		Funcionario funcionario2 = new Funcionario("Teste Cargo 2", 2, filial);
		Veiculo veiculo2 = new Veiculo(2, "Teste Placa 2", data2, "Teste Cor 2", "Teste Modelo 2", "Teste Fabricante 2",
				"Teste Estado 2", funcionario2, "Teste Status 2");
		aluguel.setCarroalugado(veiculo2);
		aluguel.setCodigoaluguel(2);
		aluguel.setDatafim(data2);
		aluguel.setDatainicio(data2);
		aluguel.setLocatario(cliente2);
		aluguel.setSituacao("Teste Status 2");
		aluguel.setValortotal(100.00);
		assertFalse(aluguel.getCodigoaluguel() == 1);
		assertFalse(aluguel.getDatafim() == data);
		assertFalse(aluguel.getDatainicio() == data);
		assertFalse(aluguel.getSituacao() == "Tudo ok!");
		assertFalse(aluguel.getValortotal() == 80.0);
		assertFalse(aluguel.getLocatario().equals(cliente));
		assertFalse(aluguel.getCarroalugado().equals(veiculo));
	}
}