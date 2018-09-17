package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import model.Filial;

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

	}

	@FXML
	void excluirFilial(ActionEvent event) {

	}

	@FXML
	void novaFilial(ActionEvent event) {

	}

}
