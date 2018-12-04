package estaticos;

import banco.ClienteBanco;
import banco.VeiculoBanco;
import dao.ClienteDAO;
import dao.VeiculoDAO;
import model.Cliente;
import model.Veiculo;

public class EstaticosParaAluguel {

	public static Cliente clienteEstatica;

	public static Cliente achaCliente(String nomeCliente) {
		Cliente cliente = null;
		ClienteDAO clientedao = new ClienteBanco();
		for (Cliente f : clientedao.listar()) {
			if (f.getNome().equals(nomeCliente)) {
				cliente = f;
			}
		}
		return cliente;
	}

	public static Veiculo veiculoEstatica;

	public static Veiculo achaVeiculo(String modeloVeiculo) {
		Veiculo veiculo = null;
		VeiculoDAO veiculodao = new VeiculoBanco();
		for (Veiculo f : veiculodao.listar()) {
			if (f.getModelo().equals(modeloVeiculo)) {
				veiculo = f;
			}
		}
		return veiculo;
	}

}
