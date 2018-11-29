package controllers;

import java.io.IOException;
import java.sql.Date;

import banco.VeiculoBanco;
import dao.VeiculoDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Funcionario;
import model.Veiculo;
import principal.Main;

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

	VeiculoDAO veiculodao = new VeiculoBanco();

	Veiculo veiculo;

	@FXML
	void cancelar(ActionEvent event) {
		voltarVeiculos();
	}

	@FXML
	void salvar(ActionEvent event) {
		preencheveiculo();
		veiculodao.inserir(veiculo);
		voltarVeiculos();
	}

	public void voltarVeiculos() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/Menu.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	void preencheveiculo() {
		veiculo = new Veiculo();
		veiculo.setPlaca(tfPlaca.getText());
		veiculo.setAnofabricacao(Date.valueOf(String.valueOf(dtAnoFabricacao)));
		veiculo.setFabricante(tfFabricante.getText());
		veiculo.setModelo(tfModelo.getText());
		veiculo.setCor(cpCor.getId());
		veiculo.setEstado(tfEstado.getText());
		veiculo.setProprietario(cbxFuncPropietario.getValue());
		veiculo.setStatus(tfStatus.getText());
	}
}