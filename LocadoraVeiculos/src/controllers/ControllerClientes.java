package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import model.Cliente;

public class ControllerClientes {

	@FXML
	private Button btNewCliente;

	@FXML
	private TableColumn<Cliente, Integer> tcIdCliente;

	@FXML
	private TableColumn<Cliente, String> tcNomeCliente;

	@FXML
	private TableColumn<Cliente, String> tcCPF;

	@FXML
	private TableColumn<Cliente, String> tcCNH;

	@FXML
	private TableColumn<Cliente, String> tcRG;

	@FXML
	private TableColumn<Cliente, Integer> tcIdade;

	@FXML
	private TableColumn<Cliente, String> tcTelefoneCliente;

	@FXML
	private TableColumn<Cliente, String> tcEmail;

	@FXML
	private TableColumn<Cliente, Boolean> tcLocando;

	@FXML
	private Button btEditCliente;

	@FXML
	private Button btExcluirCliente;

	@FXML
	void adicionarCliente(ActionEvent event) {

	}

	@FXML
	void editarCliente(ActionEvent event) {

	}

	@FXML
	void excluirCliente(ActionEvent event) {

	}

}
