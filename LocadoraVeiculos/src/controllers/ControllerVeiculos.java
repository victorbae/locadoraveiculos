package controllers;

import java.io.IOException;
import java.util.Date;

import banco.VeiculoBanco;
import dao.VeiculoDAO;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Funcionario;
import model.Veiculo;
import principal.Main;

public class ControllerVeiculos {

	@FXML
	private Button btCadastrarVeiculos;

	@FXML
	private TableView<Veiculo> tcVeiculos;

	@FXML
	private TableColumn<Veiculo, Integer> tcIdVeiculo;

	@FXML
	private TableColumn<Veiculo, String> tcPlaca;

	@FXML
	private TableColumn<Veiculo, Date> tcAnoFabricacao;

	@FXML
	private TableColumn<Veiculo, String> tcCor;

	@FXML
	private TableColumn<Veiculo, String> tcModelo;

	@FXML
	private TableColumn<Veiculo, String> tcFabricante;

	@FXML
	private TableColumn<Veiculo, String> tcEstado;

	@FXML
	private TableColumn<Veiculo, Funcionario> tcPropretario;

	@FXML
	private TableColumn<Veiculo, String> tcStatus;

	@FXML
	private Button btEditVeiculo;

	@FXML
	private Button btExcluirVeiculo;

	private Veiculo veiculo;

	private VeiculoDAO veiculoDAO = new VeiculoBanco();

	@FXML
	private void initialize() {
		tcAnoFabricacao.setCellValueFactory(new PropertyValueFactory<>("anofabricacao"));
		tcCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
		tcEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
		tcFabricante.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
		tcIdVeiculo.setCellValueFactory(new PropertyValueFactory<>("codigoveiculo"));
		tcModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
		tcPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
		tcPropretario.setCellValueFactory(new PropertyValueFactory<>("proprietario"));
		tcStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
		tcVeiculos.setItems(FXCollections.observableArrayList(veiculoDAO.listar()));
	}

	@FXML
	void cadastrarVeiculos(ActionEvent event) {
		telaNewVeiculo();
	}

	@FXML
	void editarVeiculo(ActionEvent event) {
		telaNewVeiculo();
	}

	@FXML
	void excluirVeiculo(ActionEvent event) {
		if (tcVeiculos.getSelectionModel().getSelectedItem() != null) {
			veiculo = tcVeiculos.getSelectionModel().getSelectedItem();
			veiculoDAO.excluir(veiculo);
		}
		tcVeiculos.setItems(FXCollections.observableArrayList(veiculoDAO.listar()));
		tcVeiculos.refresh();
	}

	public void telaNewVeiculo() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/NovoVeiculo.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
