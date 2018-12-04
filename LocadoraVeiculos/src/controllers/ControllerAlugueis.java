package controllers;

import java.io.IOException;
import java.util.Date;

import banco.AluguelBanco;
import dao.AluguelDAO;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;
import principal.Main;

public class ControllerAlugueis {

	@FXML
	private Button btNewAluguel;

	@FXML
	private Button finalAluguel;

	@FXML
	private TableView<Aluguel> tcAluguel;

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

	private Aluguel aluguel;
	private AluguelDAO aluguelDAO = new AluguelBanco();

	@FXML
	private void initialize() {
		tcCarroAlugado.setCellValueFactory(new PropertyValueFactory<>("carroalugado"));
		tcDataFim.setCellValueFactory(new PropertyValueFactory<>("datafim"));
		tcDataInicio.setCellValueFactory(new PropertyValueFactory<>("datainicio"));
		tcIdAluguel.setCellValueFactory(new PropertyValueFactory<>("codigoaluguel"));
		tcLocatario.setCellValueFactory(new PropertyValueFactory<>("locatario"));
		tcSituacao.setCellValueFactory(new PropertyValueFactory<>("situacao"));
		tcValorTotal.setCellValueFactory(new PropertyValueFactory<>("valortotal"));
		tcAluguel.setItems(FXCollections.observableArrayList(aluguelDAO.listar()));
	}

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
		if (tcAluguel.getSelectionModel().getSelectedItem() != null) {
			aluguel = tcAluguel.getSelectionModel().getSelectedItem();
			aluguelDAO.excluir(aluguel);
		}
		tcAluguel.setItems(FXCollections.observableArrayList(aluguelDAO.listar()));
		tcAluguel.refresh();
	}

	@FXML
	void finalizarAluguel(ActionEvent event) {
		if (tcAluguel.getSelectionModel().getSelectedItem() != null) {
			aluguel = tcAluguel.getSelectionModel().getSelectedItem();
			aluguel.setSituacao("FINALIZADO");
			aluguelDAO.alterar(aluguel);
		}
		tcAluguel.setItems(FXCollections.observableArrayList(aluguelDAO.listar()));
		tcAluguel.refresh();
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
