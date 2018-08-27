package estaticos;

import banco.ClienteBanco;
import banco.VeiculoBanco;
import dao.ClienteDAO;
import dao.VeiculoDAO;
import model.Cliente;
import model.Veiculo;

public class EstaticosParaAluguel {

	public static Cliente clienteEstatica;

	public static Cliente achaCliente(Integer codigoCliente) {
		Cliente cliente = null;
		ClienteDAO clientedao = new ClienteBanco();
		for (Cliente f : clientedao.listar()) {
			if (f.getCodigoCliente().equals(codigoCliente)) {
				cliente = f;
			}
		}
		return cliente;
	}

	public static Veiculo veiculoEstatica;

	public static Veiculo achaVeiculo(Integer codigoVeiculo) {
		Veiculo veiculo = null;
		VeiculoDAO veiculodao = new VeiculoBanco();
		for (Veiculo f : veiculodao.listar()) {
			if (f.getCodigoveiculo().equals(codigoVeiculo)) {
				veiculo = f;
			}
		}
		return veiculo;
	}

}
