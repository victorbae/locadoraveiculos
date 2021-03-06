package controllers;

import java.io.IOException;
import java.sql.Date;

import banco.FuncionarioBanco;
import banco.VeiculoBanco;
import dao.FuncionarioDAO;
import dao.VeiculoDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
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
	private Label lbCor;

	@FXML
	private Label lbModelo;

	@FXML
	private Label lbFAB;

	@FXML
	private Label lbProp;
	@FXML
	private Label lbData;

	@FXML
	private DatePicker dtAnoFabricacao;

	@FXML
	private ComboBox<Funcionario> cbxFuncPropietario;

	@FXML
	private TextField tfCor;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	private VeiculoDAO veiculodao = new VeiculoBanco();

	private Veiculo veiculo;

	@FXML
	public void initialize() {
		populaCombos();
	}

	@FXML
	void cancelar(ActionEvent event) {
		voltarVeiculos();
	}

	@FXML
	void salvar(ActionEvent event) {
		preencheveiculo();
		if (validaInsercao()) {
			veiculodao.inserir(veiculo);
			voltarVeiculos();
		}

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
		if (dtAnoFabricacao.getValue() != null) {
			veiculo.setAnofabricacao(Date.valueOf(dtAnoFabricacao.getValue()));
		}
		veiculo.setFabricante(tfFabricante.getText());
		veiculo.setModelo(tfModelo.getText());
		veiculo.setCor(tfCor.getText());
		veiculo.setEstado(tfEstado.getText());
		veiculo.setProprietario(cbxFuncPropietario.getValue());
		veiculo.setStatus(tfStatus.getText());
	}

	private void populaCombos() {
		FuncionarioDAO funcionarioDAO = new FuncionarioBanco();
		for (Funcionario funcionario : funcionarioDAO.listar()) {
			cbxFuncPropietario.getItems().add(funcionario);
		}
	}

	public boolean validaInsercao() {
		int cont = 0;
		if (tfCor.getText().isEmpty() || tfCor.getText() == null) {
			lbCor.setText("Dados Vazios ou Inválidos!");
			cont = 1;
		} else {
			lbCor.setText("");
		}
		if (!tfModelo.getText().matches("^[a-zA-Z]+$")) {
			lbModelo.setText("Dados Vazios ou Inválidos!");
			cont = 1;
		} else {
			lbModelo.setText("");
		}
		if (dtAnoFabricacao.getValue() == null) {
			lbData.setText("Dados Vazios ou Inválidos!");
			cont = 1;
		} else {
			lbData.setText("");
		}
		if (!tfFabricante.getText().matches("^[a-zA-Z]+$")) {
			lbFAB.setText("Dados Vazios ou Inválidos!");
			cont = 1;
		} else {
			lbFAB.setText("");
		}
		if (cbxFuncPropietario.getValue() == null) {
			lbProp.setText("Dados Vazios ou Inválidos!");
			cont = 1;
		} else {
			lbProp.setText("");
		}
		if (cont > 0) {
			return false;
		}
		return true;
	}
}