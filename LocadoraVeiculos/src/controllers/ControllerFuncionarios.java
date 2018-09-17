package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Filial;
import model.Funcionario;

public class ControllerFuncionarios {

	@FXML
	private Button btAdicionarFuncionario;

	@FXML
	private TableView<?> tbl;

	@FXML
	private TableColumn<Funcionario, Integer> tcIdFuncionario;

	@FXML
	private TableColumn<Funcionario, String> tcNomeFuncionario;

	@FXML
	private TableColumn<Funcionario, String> tcCargo;

	@FXML
	private TableColumn<Funcionario, String> tcCpf;

	@FXML
	private TableColumn<Funcionario, String> tcTelefone;

	@FXML
	private TableColumn<Funcionario, String> tcEndereco;

	@FXML
	private TableColumn<Funcionario, Filial> tcFilial;

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
