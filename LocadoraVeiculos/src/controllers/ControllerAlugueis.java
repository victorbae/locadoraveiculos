package controllers;

import java.io.IOException;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;
import principal.Main;

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
		telaNewAluguel();
	}

	@FXML
	void editarAluguel(ActionEvent event) {
		telaNewAluguel();
	}

	@FXML
	void excluirAluguel(ActionEvent event) {
		telaNewAluguel();
	}

	public void telaNewAluguel() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/NovoAluguel.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
