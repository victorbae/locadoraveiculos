package estaticos;

import banco.FuncionarioBanco;
import dao.FuncionarioDAO;
import model.Funcionario;

public class EstaticosParaVeiculos {

	public static Funcionario funcionarioEstatica;

	public static Funcionario achaFuncionario(Integer codigoFuncionario) {
		Funcionario funcionario = null;
		FuncionarioDAO funcionariodao = new FuncionarioBanco();
		for (Funcionario f : funcionariodao.listar()) {
			if (f.getCodigoFuncionario().equals(codigoFuncionario)) {
				funcionario = f;
			}
		}
		return funcionario;
	}

}
