package banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.FuncionarioDAO;
import estaticos.EstaticosParaFuncionario;
import model.Funcionario;

public class FuncionarioBanco implements FuncionarioDAO {

	@Override
	public void inserir(Funcionario dado) {
		try {
			String sql = "insert into funcionarios (codigocliente,nome,cargo,cpf,rg,cnh,idade,telefone,email,filial) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoFuncionario());
			stmt.setString(2, dado.getNome());
			stmt.setString(3, dado.getCargo());
			stmt.setString(4, dado.getCpf());
			stmt.setString(5, dado.getRg());
			stmt.setString(6, dado.getCnh());
			stmt.setString(7, dado.getDatanascimento().toString());
			stmt.setString(8, dado.getTelefone());
			stmt.setString(9, dado.getEmail());
			stmt.setInt(10, dado.getFilial().getCodigoFilial());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Funcionario dado) {
		try {
			String sql = "update funcionarios set nome = ?,cargo = ?,cpf = ?,rg = ?,cnh = ?,idade = ?,telefone = ?,email = ?,filial = ? where codigocliente = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);

			stmt.setString(1, dado.getNome());
			stmt.setString(2, dado.getCargo());
			stmt.setString(3, dado.getCpf());
			stmt.setString(4, dado.getRg());
			stmt.setString(5, dado.getCnh());
			stmt.setString(6, dado.getDatanascimento().toString());
			stmt.setString(7, dado.getTelefone());
			stmt.setString(8, dado.getEmail());
			stmt.setInt(9, dado.getFilial().getCodigoFilial());
			stmt.setInt(10, dado.getCodigoFuncionario());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Funcionario dado) {
		try {
			String sql = "delete from funcionarios where codigofuncionario = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoFuncionario());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Funcionario> listar() {
		List<Funcionario> funcionarios = new ArrayList<>();
		try {
			Statement stmt = ConexaoPrincipal.retornaconecao().createStatement();
			ResultSet rs = stmt.executeQuery("select * from funcionarios");
			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setCodigoFuncionario(rs.getInt("codigofuncionario"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setCargo(rs.getString("cargo"));
				funcionario.setCpf(rs.getString("cpf"));
				funcionario.setRg(rs.getString("rg"));
				funcionario.setCnh(rs.getString("cnh"));
				funcionario.setDatanascimento(LocalDate.parse(rs.getString("idade")));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setFilial(EstaticosParaFuncionario.achaFilial(rs.getInt("filial")));
				funcionarios.add(funcionario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionarios;

	}

}
