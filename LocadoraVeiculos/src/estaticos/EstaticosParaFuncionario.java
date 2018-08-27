package estaticos;

import banco.FilialBanco;
import dao.FilialDAO;
import model.Filial;

public class EstaticosParaFuncionario {

	public static Filial filialEstatica;

	public static Filial achaFilial(Integer codigoFilial) {
		Filial filial = null;
		FilialDAO filialdao = new FilialBanco();
		for (Filial f : filialdao.listar()) {
			if (f.getCodigoFilial().equals(codigoFilial)) {
				filial = f;
			}
		}
		return filial;
	}
}
