package controllers;

import java.io.IOException;

import banco.ClienteBanco;
import dao.ClienteDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
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
	private TextField tfEmail;

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
		clienteDao.inserir(cliente);
		voltarClientes();
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

}
