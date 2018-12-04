package banco;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.VeiculoDAO;
import estaticos.EstaticosParaVeiculos;
import model.Veiculo;

public class VeiculoBanco implements VeiculoDAO {

	@Override
	public void inserir(Veiculo dado) {
		try {
			String sql = "insert into veiculos (codigoveiculo,placa,anofabricacao,cor,modelo,fabricante,estado,proprietario,status) values(null,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
//			stmt.setInt(1, dado.getCodigoveiculo());
			stmt.setString(1, dado.getPlaca());
			stmt.setDate(2, (Date) dado.getAnofabricacao());
			stmt.setString(3, dado.getCor());
			stmt.setString(4, dado.getModelo());
			stmt.setString(5, dado.getFabricante());
			stmt.setString(6, dado.getEstado());
			stmt.setInt(7, dado.getProprietario().getCodigoFuncionario());
			stmt.setString(8, dado.getStatus());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Veiculo dado) {
		try {
			String sql = "update veiculos set placa = ?," + "anofabricacao = ?," + "cor = ?," + "modelo = ?,"
					+ "fabricante = ?," + "estado = ?," + "proprietario = ?," + "status= ? "
					+ "where codigoveiculo = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);

			stmt.setString(1, dado.getPlaca());
			stmt.setDate(2, (Date) dado.getAnofabricacao());
			stmt.setString(3, dado.getCor());
			stmt.setString(4, dado.getModelo());
			stmt.setString(5, dado.getFabricante());
			stmt.setString(6, dado.getEstado());
			stmt.setInt(7, dado.getProprietario().getCodigoFuncionario());
			stmt.setString(8, dado.getStatus());
			stmt.setInt(9, dado.getCodigoveiculo());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void excluir(Veiculo dado) {
		try {
			String sql = "delete from veiculos where codigoveiculo = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoveiculo());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Veiculo> listar() {
		List<Veiculo> veiculos = new ArrayList<>();
		try {
			Statement stmt = ConexaoPrincipal.retornaconecao().createStatement();
			ResultSet rs = stmt.executeQuery("select * from veiculos");
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setCodigoveiculo(rs.getInt("codigoveiculo"));
				veiculo.setPlaca(rs.getString("placa"));
				veiculo.setAnofabricacao(rs.getDate("anofabricacao"));
				veiculo.setCor(rs.getString("cor"));
				veiculo.setModelo(rs.getString("modelo"));
				veiculo.setFabricante(rs.getString("fabricante"));
				veiculo.setEstado(rs.getString("estado"));
				veiculo.setProprietario(EstaticosParaVeiculos.achaFuncionario(rs.getInt("proprietario")));
				veiculo.setStatus(rs.getString("status"));
				veiculos.add(veiculo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return veiculos;
	}

}
