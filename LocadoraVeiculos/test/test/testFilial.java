package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Filial;

public class testFilial {
	Filial filial = new Filial(1, "Teste Nome", "Teste Cidade", "Teste Endereco", "Teste Telefone");

	@Test
	public void testsFilial() {
		assertTrue(filial.getCidade() == "Teste Cidade");
		assertTrue(filial.getCodigoFilial() == 1);
		assertTrue(filial.getEndereco() == "Teste Endereco");
		assertTrue(filial.getNomefilial() == "Teste Nome");
		assertTrue(filial.getTelefone() == "Teste Telefone");
	}

	@Test
	public void testSetFilial() {
		filial.setCidade("Teste Cidade 2");
		filial.setCodigoFilial(2);
		filial.setEndereco("Teste Endereco 2");
		filial.setNomefilial("Teste Nome 2");
		filial.setTelefone("Teste Telefone 2");

		assertFalse(filial.getCidade() == "Teste Cidade");
		assertFalse(filial.getCodigoFilial() == 1);
		assertFalse(filial.getEndereco() == "Teste Endereco");
		assertFalse(filial.getNomefilial() == "Teste Nome");
		assertFalse(filial.getTelefone() == "Teste Telefone");
	}
}