package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class ControllerAlugueis {

	@FXML
	private Button btNewAluguel;

	@FXML
	private TableColumn<?, ?> tcIdAluguel;

	@FXML
	private TableColumn<?, ?> tcLocatario;

	@FXML
	private TableColumn<?, ?> tcCarroAlugado;

	@FXML
	private TableColumn<?, ?> tcDataInicio;

	@FXML
	private TableColumn<?, ?> tcDataFim;

	@FXML
	private TableColumn<?, ?> tcSituacao;

	@FXML
	private TableColumn<?, ?> tcValorTotal;

	@FXML
	private Button btEditAluguel;

	@FXML
	private Button btExcluirAluguel;

	@FXML
	void criarNovoAluguel(ActionEvent event) {

	}

	@FXML
	void editarAluguel(ActionEvent event) {

	}

	@FXML
	void excluirAluguel(ActionEvent event) {

	}

}
