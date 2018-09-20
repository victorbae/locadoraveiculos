package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import principal.Main;

public class ControllerNewCliente {

	@FXML
	private DatePicker dtDataNascimento;

	@FXML
	private TextField tfNome;

	@FXML
	private TextField tfCPF;

	@FXML
	private TextField tfRG;

	@FXML
	private TextField tfCNH;

	@FXML
	private TextField tfTelefone;

	@FXML
	private TextField tfEmail;

	@FXML
	private TextField tfEndereco;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	@FXML
	void cancelar(ActionEvent event) {
		voltarClientes();
	}

	@FXML
	void salvar(ActionEvent event) {
		voltarClientes();
	}

	public void voltarClientes() {
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
