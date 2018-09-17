package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Funcionario;

public class ControllerNewVeiculo {

	@FXML
	private TextField tfPlaca;

	@FXML
	private TextField tfModelo;

	@FXML
	private TextField tfFabricante;

	@FXML
	private TextField tfEstado;

	@FXML
	private TextField tfStatus;

	@FXML
	private DatePicker dtAnoFabricacao;

	@FXML
	private ComboBox<Funcionario> cbxFuncPropietario;

	@FXML
	private ColorPicker cpCor;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	@FXML
	void cancelar(ActionEvent event) {

	}

	@FXML
	void salvar(ActionEvent event) {

	}

}
