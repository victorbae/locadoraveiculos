package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Filial;
import model.Funcionario;

public class testFuncionario {
	@Test
	public void testGetFuncionario() {
		Filial filial = new Filial(1, "Teste Nome", "Teste Cidade", "Teste End", "Teste telefone");
		Funcionario funcionario = new Funcionario("Teste Cargo", 1, filial);
		assertTrue(funcionario.getCargo() == "Teste Cargo");
		assertTrue(funcionario.getFilial().equals(filial));
		assertTrue(funcionario.getCodigoFuncionario() == 1);
	}

	@Test
	public void testSetFuncionario() {
		Filial filial = new Filial(1, "Teste Nome", "Teste Cidade", "Teste End", "Teste telefone");
		Funcionario funcionario = new Funcionario("Teste Cargo", 1, filial);
		Filial filial2 = new Filial(1, "Teste Nome 2", "Teste Cidade 2", "Teste End 2", "Teste telefone 2");
		funcionario.setCargo("Teste Cargo 2");
		funcionario.setCodigoFuncionario(2);
		funcionario.setFilial(filial2);
		assertFalse(funcionario.getCargo() == "Teste Cargo");
		assertFalse(funcionario.getFilial().equals(filial));
		assertFalse(funcionario.getCodigoFuncionario() == 1);
	}
}