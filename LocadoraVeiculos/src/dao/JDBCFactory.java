package dao;

import banco.AluguelBanco;
import banco.ClienteBanco;
import banco.FilialBanco;
import banco.FuncionarioBanco;
import banco.VeiculoBanco;

public class JDBCFactory implements DAOFactory {

	@Override
	public FuncionarioDAO funcionarioDAO() {
		return new FuncionarioBanco();
	}

	@Override
	public ClienteDAO clienteDAO() {
		return new ClienteBanco();
	}

	@Override
	public FilialDAO filialDAO() {
		return new FilialBanco();
	}

	@Override
	public VeiculoDAO veiculoDAO() {
		return new VeiculoBanco();
	}

	@Override
	public AluguelDAO aluguelDAO() {
		return new AluguelBanco();
	}
}
