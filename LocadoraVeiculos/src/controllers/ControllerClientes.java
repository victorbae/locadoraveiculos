package controllers;

import java.io.IOException;

import banco.ClienteBanco;
import dao.ClienteDAO;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import principal.Main;

public class ControllerClientes {

	@FXML
	private Button btNewCliente;

	@FXML
	private TableView<Cliente> tcCliente;

	@FXML
	private TableColumn<Cliente, Integer> tcIdCliente;

	@FXML
	private TableColumn<Cliente, String> tcNomeCliente;

	@FXML
	private TableColumn<Cliente, String> tcCPF;

	@FXML
	private TableColumn<Cliente, String> tcCNH;

	@FXML
	private TableColumn<Cliente, String> tcRG;

	@FXML
	private TableColumn<Cliente, Integer> tcIdade;

	@FXML
	private TableColumn<Cliente, String> tcTelefoneCliente;

	@FXML
	private TableColumn<Cliente, String> tcEmail;

	@FXML
	private TableColumn<Cliente, Boolean> tcLocando;

	@FXML
	private Button btEditCliente;

	@FXML
	private Button btExcluirCliente;

	private ClienteDAO clienteDao = new ClienteBanco();

	private Cliente cliente;

	@FXML
	private void initialize() {
		tcIdCliente.setCellValueFactory(new PropertyValueFactory<>("codigoCliente"));
		tcNomeCliente.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tcCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tcCNH.setCellValueFactory(new PropertyValueFactory<>("cnh"));
		tcRG.setCellValueFactory(new PropertyValueFactory<>("rg"));
		tcIdade.setCellValueFactory(new PropertyValueFactory<>("datanascimento"));
		tcTelefoneCliente.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
//		tcLocando.setCellValueFactory(new PropertyValueFactory<>(""));
		tcCliente.setItems(FXCollections.observableArrayList(clienteDao.listar()));
		tcCliente.refresh();
	}

	@FXML
	void adicionarCliente(ActionEvent event) {
		telaNewCliente();
	}

	@FXML
	void editarCliente(ActionEvent event) {

	}

	@FXML
	void excluirCliente(ActionEvent event) {
		if (tcCliente.getSelectionModel().getSelectedItem() != null) {
			cliente = tcCliente.getSelectionModel().getSelectedItem();
			clienteDao.excluir(cliente);
		}
		tcCliente.setItems(FXCollections.observableArrayList(clienteDao.listar()));
		tcCliente.refresh();
	}

	public void telaNewCliente() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/NovoCliente.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
