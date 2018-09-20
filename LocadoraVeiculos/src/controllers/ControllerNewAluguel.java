package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import model.Veiculo;
import principal.Main;

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
		voltarTela();
	}

	@FXML
	void salvar(ActionEvent event) {
		voltarTela();
	}

	public void voltarTela() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/Menu.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
