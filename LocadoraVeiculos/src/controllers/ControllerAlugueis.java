package controllers;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;

public class ControllerAlugueis {

	@FXML
	private Button btNewAluguel;

	@FXML
	private TableColumn<Aluguel, Integer> tcIdAluguel;

	@FXML
	private TableColumn<Aluguel, Cliente> tcLocatario;

	@FXML
	private TableColumn<Aluguel, Veiculo> tcCarroAlugado;

	@FXML
	private TableColumn<Aluguel, Date> tcDataInicio;

	@FXML
	private TableColumn<Aluguel, Date> tcDataFim;

	@FXML
	private TableColumn<Aluguel, String> tcSituacao;

	@FXML
	private TableColumn<Aluguel, Double> tcValorTotal;

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
