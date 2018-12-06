package controllers;

import java.io.IOException;

import banco.ClienteBanco;
import dao.ClienteDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import principal.Main;

public class ControllerNewCliente {

	@FXML
	private DatePicker dtDataNascimento;

	@FXML
	private TextField tfNome;

	@FXML
	private TextField tfCPF;

	@FXML
	private TextField tfRG;

	@FXML
	private TextField tfCNH;

	@FXML
	private TextField tfTelefone;

	@FXML
	private Label lbCPF;

	@FXML
	private Label lbRG;
	
	@FXML
	private Label lbCNH;
	@FXML
	private Label lbTelefone;
	@FXML
	private Label lbEndereco;
	@FXML
	private Label lbDT;
	@FXML
	private TextField tfEmail;
	@FXML
	private Label lbNome;

	@FXML
	private TextField tfEndereco;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	private ClienteDAO clienteDao = new ClienteBanco();
	private Cliente cliente;

	@FXML
	void cancelar(ActionEvent event) {
		voltarClientes();
	}

	@FXML
	void salvar(ActionEvent event) {
		populaCliente();
		if (validaInsercao()) {
			clienteDao.inserir(cliente);
			voltarClientes();
		}
	}

	public void voltarClientes() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/Menu.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void populaCliente() {
		cliente = new Cliente();

		cliente.setCnh(tfCNH.getText());
		cliente.setCpf(tfCPF.getText());
		cliente.setEmail(tfEmail.getText());
		cliente.setEndereco(tfEndereco.getText());
		cliente.setDatanascimento(dtDataNascimento.getValue());
		cliente.setNome(tfNome.getText());
		cliente.setTelefone(tfTelefone.getText());
		cliente.setRg(tfRG.getText());
	}

	public boolean validaInsercao() {
		int cont = 0;
		if (!tfNome.getText().matches("^[a-zA-Z]+$")) {
			lbNome.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbNome.setText("");
		}
		if (dtDataNascimento.getValue() == null) {
			lbDT.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbDT.setText("");
		}
		if (!tfCPF.getText().matches("^[a-zA-Z]+$")) {
			lbCPF.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbCPF.setText("");
		}
		if (!tfCNH.getText().matches("^[a-zA-Z]+$")) {
			lbCNH.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbCNH.setText("");
		}
		if (!tfRG.getText().matches("^[a-zA-Z]+$")) {
			lbRG.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbRG.setText("");
		}
		if (!tfTelefone.getText().matches("^[a-zA-Z]+$")) {
			lbTelefone.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbTelefone.setText("");
		}
		if (!tfEndereco.getText().matches("^[a-zA-Z]+$")) {
			lbEndereco.setText("Preencha este Campo!");
			cont = 1;
		} else {
			lbEndereco.setText("");
		}
		if (cont > 0) {
			return false;
		}
		return true;
	}
}