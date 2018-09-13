package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import principal.Main;

public class ControllerLogin {

	@FXML
	private TextField tdlogin;

	@FXML
	private TextField tfsenha;

	@FXML
	private Hyperlink hplesquecisenha;

	@FXML
	private Button btacessar;

	@FXML
	void acessar(ActionEvent event) {
		proximaTela();
	}

	void proximaTela() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/telas/Menu.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
