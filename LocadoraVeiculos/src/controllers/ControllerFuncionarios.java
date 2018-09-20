package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import model.Filial;
import model.Funcionario;
import principal.Main;

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
		telaNewFuncionario();
	}

	@FXML
	void editarFuncionario(ActionEvent event) {
		telaNewFuncionario();
	}

	@FXML
	void excluirFuncionario(ActionEvent event) {
		telaNewFuncionario();
	}

	public void telaNewFuncionario() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/NovaFilial.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
