package test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Pessoa;

public class testPessoa {
	Pessoa pessoa = new Pessoa("Teste nome", "Teste CPF", "Teste RG", "Teste CNH", LocalDate.parse("2018-01-01"),
			"Teste Telefone", "teste@teste", "Teste End");

	@Test
	public void testGetPessoa() {
		assertTrue(pessoa.getCnh() == "Teste CNH");
		assertTrue(pessoa.getCpf() == "Teste CPF");
		assertTrue(pessoa.getEmail() == "teste@teste");
		assertTrue(pessoa.getEndereco() == "Teste End");
		assertTrue(pessoa.getDatanascimento().equals(LocalDate.parse("2018-01-01")));
		assertTrue(pessoa.getNome() == "Teste nome");
		assertTrue(pessoa.getRg() == "Teste RG");
		assertTrue(pessoa.getTelefone() == "Teste Telefone");
	}

	@Test
	public void testSetPessoa() {
		pessoa.setCnh("Teste CNH 2");
		pessoa.setCpf("Teste CPF 2");
		pessoa.setEmail("teste2@teste2");
		pessoa.setEndereco("Teste End 2");
		pessoa.setDatanascimento(LocalDate.parse("2018-01-02"));
		pessoa.setNome("Teste Nome 2");
		pessoa.setRg("Teste RG 2");
		pessoa.setTelefone("Teste Telefone 2");
		assertFalse(pessoa.getCnh() == "Teste CNH");
		assertFalse(pessoa.getCpf() == "Teste CPF");
		assertFalse(pessoa.getEmail() == "teste@teste");
		assertFalse(pessoa.getEndereco() == "Teste End");
		assertFalse(pessoa.getDatanascimento() == LocalDate.parse("2018-08-01"));
		assertFalse(pessoa.getNome() == "Teste nome");
		assertFalse(pessoa.getRg() == "Teste RG");
		assertFalse(pessoa.getTelefone() == "Teste Telefone");
	}
}