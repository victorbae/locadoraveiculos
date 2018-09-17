package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Veiculo;

public class ControllerNewAluguel {

	@FXML
	private DatePicker dtDataInicio;

	@FXML
	private DatePicker dtDataFim;

	@FXML
	private ComboBox<Veiculo> cbxVeiculo;

	// Criar Classe para deixar definido a situaçao
	@FXML
	private ComboBox<?> cbxSituacao;

	@FXML
	private TextField tfValorTotal;

	@FXML
	private ComboBox<Cliente> cbxCliente;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	@FXML
	void cancelar(ActionEvent event) {

	}

	@FXML
	void salvar(ActionEvent event) {

	}

}
