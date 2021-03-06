package banco;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.AluguelDAO;
import estaticos.EstaticosParaAluguel;
import model.Aluguel;

public class AluguelBanco implements AluguelDAO {

	@Override
	public void inserir(Aluguel dado) {
		try {
			String sql = "insert into alugueis (codigoaluguel,locatario,carroalugado,datainicio,datafim,situacao,valortotal) values(null,?,?,?,?,?,?)";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setString(1, dado.getLocatario().getNome());
			stmt.setString(2, dado.getCarroalugado().getModelo());
			stmt.setDate(3, (Date) dado.getDatainicio());
			stmt.setDate(4, (Date) dado.getDatafim());
			stmt.setString(5, dado.getSituacao());
			stmt.setDouble(6, dado.getValortotal());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Aluguel dado) {
		try {
			String sql = "update alugueis set locatario = ?,carroalugado = ?,datainicio = ?,datafim = ?,situacao = ?,valortotal = ? where codigoaluguel = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);

			stmt.setString(1, dado.getLocatario().getNome());
			stmt.setString(2, dado.getCarroalugado().getModelo());
			stmt.setDate(3, (Date) dado.getDatainicio());
			stmt.setDate(4, (Date) dado.getDatafim());
			stmt.setString(5, dado.getSituacao());
			stmt.setDouble(6, dado.getValortotal());
			stmt.setInt(7, dado.getCodigoaluguel());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Aluguel dado) {
		try {
			String sql = "delete from alugueis where codigoaluguel = ?";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoaluguel());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Aluguel> listar() {
		List<Aluguel> aluguels = new ArrayList<>();
		try {
			Statement stmt = ConexaoPrincipal.retornaconecao().createStatement();
			ResultSet rs = stmt.executeQuery("select * from alugueis");
			while (rs.next()) {
				Aluguel aluguel = new Aluguel();
				aluguel.setCodigoaluguel(rs.getInt("codigoaluguel"));
				aluguel.setLocatario(EstaticosParaAluguel.achaCliente(rs.getString("locatario")));
				aluguel.setCarroalugado(EstaticosParaAluguel.achaVeiculo(rs.getString("carroalugado")));
				aluguel.setDatainicio(rs.getDate("datainicio"));
				aluguel.setDatafim(rs.getDate("datafim"));
				aluguel.setSituacao(rs.getString("situacao"));
				aluguel.setValortotal(rs.getDouble("valortotal"));
				aluguels.add(aluguel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluguels;
	}

}
