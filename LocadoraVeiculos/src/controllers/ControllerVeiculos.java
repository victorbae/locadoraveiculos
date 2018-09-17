package controllers;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import model.Funcionario;
import model.Veiculo;

public class ControllerVeiculos {

	@FXML
	private Button btCadastrarVeiculos;

	@FXML
	private TableColumn<Veiculo, Integer> tcIdVeiculo;

	@FXML
	private TableColumn<Veiculo, String> tcPlaca;

	@FXML
	private TableColumn<Veiculo, Date> tcAnoFabricacao;

	@FXML
	private TableColumn<Veiculo, String> tcCor;

	@FXML
	private TableColumn<Veiculo, String> tcModelo;

	@FXML
	private TableColumn<Veiculo, String> tcFabricante;

	@FXML
	private TableColumn<Veiculo, String> tcEstado;

	@FXML
	private TableColumn<Veiculo, Funcionario> tcPropretario;

	@FXML
	private TableColumn<Veiculo, String> tcStatus;

	@FXML
	private Button btEditVeiculo;

	@FXML
	private Button btExcluirVeiculo;

	@FXML
	void cadastrarVeiculos(ActionEvent event) {

	}

	@FXML
	void editarVeiculo(ActionEvent event) {

	}

	@FXML
	void excluirVeiculo(ActionEvent event) {

	}

}
