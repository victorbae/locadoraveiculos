package dao;

public interface DAOFactory {

	ClienteDAO clienteDAO();

	FilialDAO filialDAO();

	FuncionarioDAO funcionarioDAO();

	VeiculoDAO veiculoDAO();
}
