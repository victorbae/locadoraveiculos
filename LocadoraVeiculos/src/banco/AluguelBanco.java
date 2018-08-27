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
			String sql = "insert into alugueis (codigoaluguel,locatario,carroalugado,datainicio,datafim,situacao,valortotal) values(?,?,?,?,?,?,?)";
			PreparedStatement stmt = ConexaoPrincipal.retornaconecao().prepareStatement(sql);
			stmt.setInt(1, dado.getCodigoaluguel());
			stmt.setString(2, dado.getLocatario().getNome());
			stmt.setString(3, dado.getCarroalugado().getModelo());
			stmt.setDate(4, (Date) dado.getDatainicio());
			stmt.setDate(5, (Date) dado.getDatafim());
			stmt.setString(6, dado.getSituacao());
			stmt.setDouble(7, dado.getValortotal());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Aluguel dado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(Aluguel dado) {
		try {
			String sql = "delete from alugueis where id = ?";
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
				aluguel.setLocatario(EstaticosParaAluguel.achaCliente(rs.getInt("locatario")));
				aluguel.setCarroalugado(EstaticosParaAluguel.achaVeiculo(rs.getInt("carroalugado")));
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
