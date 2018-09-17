package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControllerFuncionarios {

	@FXML
	private Button btAdicionarFuncionario;

	@FXML
	private TableView<?> tbl;

	@FXML
	private TableColumn<?, ?> tcIdFuncionario;

	@FXML
	private TableColumn<?, ?> tcNomeFuncionario;

	@FXML
	private TableColumn<?, ?> tcCpf;

	@FXML
	private TableColumn<?, ?> tcTelefone;

	@FXML
	private TableColumn<?, ?> tcEndereco;

	@FXML
	private TableColumn<?, ?> tcFilial;

	@FXML
	private Button btEditFuncionario;

	@FXML
	private Button btExcluirFuncionario;

	@FXML
	void adicionarFuncionario(ActionEvent event) {

	}

	@FXML
	void editarFuncionario(ActionEvent event) {

	}

	@FXML
	void excluirFuncionario(ActionEvent event) {

	}

}
