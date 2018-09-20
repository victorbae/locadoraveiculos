package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import model.Filial;
import principal.Main;

public class ControllerFiliais {

	@FXML
	private Button btNewFilial;

	@FXML
	private TableColumn<Filial, Integer> tcIdFilial;

	@FXML
	private TableColumn<Filial, String> tcNomeFilial;

	@FXML
	private TableColumn<Filial, String> tcCidadeFilial;

	@FXML
	private TableColumn<Filial, String> tcEnderecoFilial;

	@FXML
	private TableColumn<Filial, String> tcTelefoneFilial;

	@FXML
	private Button btEditFilial;

	@FXML
	private Button btExcluirFilial;

	@FXML
	void editarFilial(ActionEvent event) {
		telaNewFilial();
	}

	@FXML
	void excluirFilial(ActionEvent event) {
		telaNewFilial();
	}

	@FXML
	void novaFilial(ActionEvent event) {
		telaNewFilial();
	}

	public void telaNewFilial() {
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
