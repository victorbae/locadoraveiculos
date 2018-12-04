package banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteBanco implements ClienteDAO {

	@Override
	public void inserir(Cliente dado) {
		try {
			String sql = "insert into clientes (codigocliente,nome,cpf,rg,cnh,data_nascimento,telefone,email) values(null,?,?,?,?,?,?,?)";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setString(1, dado.getNome());
			stmt.setString(2, dado.getCpf());
			stmt.setString(3, dado.getRg());
			stmt.setString(4, dado.getCnh());
			stmt.setString(5, dado.getDatanascimento().toString());
			stmt.setString(6, dado.getTelefone());
			stmt.setString(7, dado.getEmail());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Cliente dado) {
		try {
			String sql = "update clientes set nome = ?,cpf = ?,rg = ?,cnh = ?,data_nascimento = ?,telefone = ?,email = ? where codigocliente = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);

			stmt.setString(1, dado.getNome());
			stmt.setString(2, dado.getCpf());
			stmt.setString(3, dado.getRg());
			stmt.setString(4, dado.getCnh());
			stmt.setString(5, dado.getDatanascimento().toString());
			stmt.setString(6, dado.getTelefone());
			stmt.setString(7, dado.getEmail());
			stmt.setInt(8, dado.getCodigoCliente());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Cliente dado) {
		try {
			String sql = "delete from clientes where codigocliente = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoCliente());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			Statement stmt = ConexaoPrincipal.retornaconecao().createStatement();
			ResultSet rs = stmt.executeQuery("select * from clientes");
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigoCliente(rs.getInt("codigocliente"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRg(rs.getString("rg"));
				cliente.setCnh(rs.getString("cnh"));
				cliente.setDatanascimento(LocalDate.parse(rs.getString("data_nascimento")));
				cliente.setTelefone(rs.getString("telefone"));
				cliente.setEmail(rs.getString("email"));
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

}
