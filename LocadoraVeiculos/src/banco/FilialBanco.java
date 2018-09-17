package banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.FilialDAO;
import model.Filial;

public class FilialBanco implements FilialDAO {

	@Override
	public void inserir(Filial dado) {
		try {
			String sql = "insert into filiais (codigofilial,nomefilial,cidade,endereco,telefone) values(?,?,?,?,?)";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoFilial());
			stmt.setString(2, dado.getNomefilial());
			stmt.setString(3, dado.getCidade());
			stmt.setString(4, dado.getEndereco());
			stmt.setString(5, String.valueOf(dado.getTelefone()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Filial dado) {
		try {
			String sql = "update filiais set nomefilial = ?,cidade = ?,endereco = ?,telefone = ? where codigofilial = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);

			stmt.setString(1, dado.getNomefilial());
			stmt.setString(2, dado.getCidade());
			stmt.setString(3, dado.getEndereco());
			stmt.setString(4, String.valueOf(dado.getTelefone()));
			stmt.setInt(5, dado.getCodigoFilial());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Filial dado) {
		try {
			String sql = "delete from filiais where id = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoFilial());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Filial> listar() {
		List<Filial> filials = new ArrayList<>();
		try {
			Statement stmt = ConexaoPrincipal.retornaconecao().createStatement();
			ResultSet rs = stmt.executeQuery("select * from filiais");
			while (rs.next()) {
				Filial filial = new Filial();
				filial.setCodigoFilial(rs.getInt("codigofilial"));
				filial.setNomefilial(rs.getString("nomefilial"));
				filial.setCidade(rs.getString("cidade"));
				filial.setEndereco(rs.getString("endereco"));
				filial.setTelefone(rs.getString("telefone"));
				filials.add(filial);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filials;
	}

}
