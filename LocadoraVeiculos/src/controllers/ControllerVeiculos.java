package controllers;

import java.io.IOException;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import model.Funcionario;
import model.Veiculo;
import principal.Main;

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
		telaNewVeiculo();
	}

	@FXML
	void editarVeiculo(ActionEvent event) {
		telaNewVeiculo();
	}

	@FXML
	void excluirVeiculo(ActionEvent event) {
		telaNewVeiculo();
	}

	public void telaNewVeiculo() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/NovoVeiculo.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
