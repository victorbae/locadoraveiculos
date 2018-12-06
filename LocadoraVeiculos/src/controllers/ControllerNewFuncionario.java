package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Funcionario;
import principal.Main;

public class ControllerNewFuncionario {

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
	private TextField tfCargo;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	Funcionario funcionario = new Funcionario();

	@FXML
	void cancelar(ActionEvent event) {
		voltarFuncionarios();
	}

	@FXML
	void salvar(ActionEvent event) {
		voltarFuncionarios();
	}

	public void voltarFuncionarios() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/Menu.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void montaFuncionario() {
		funcionario = new Funcionario();
		funcionario.setCargo(tfCargo.getText());

	}
}
