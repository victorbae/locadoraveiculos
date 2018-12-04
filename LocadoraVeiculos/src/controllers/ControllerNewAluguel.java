package controllers;

import java.io.IOException;
import java.sql.Date;

import banco.AluguelBanco;
import banco.ClienteBanco;
import banco.VeiculoBanco;
import dao.AluguelDAO;
import dao.ClienteDAO;
import dao.VeiculoDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;
import principal.Main;

public class ControllerNewAluguel {

	@FXML
	private DatePicker dtDataInicio;

	@FXML
	private DatePicker dtDataFim;

	@FXML
	private ComboBox<Veiculo> cbxVeiculo;

	// Criar Classe para deixar definido a situa�ao
	@FXML
	private ComboBox<String> cbxSituacao;

	@FXML
	private TextField tfValorTotal;

	@FXML
	private ComboBox<Cliente> cbxCliente;

	@FXML
	private Button btnCancelar;

	@FXML
	private Button btnSalvar;

	private Aluguel aluguel;
	private AluguelDAO aluguelDAO = new AluguelBanco();
	private VeiculoDAO veiculodao = new VeiculoBanco();
	private ClienteDAO clienteDao = new ClienteBanco();

	@FXML
	void initialize() {
		populaCombos();
	}

	@FXML
	void cancelar(ActionEvent event) {
		voltarTela();
	}

	@FXML
	void salvar(ActionEvent event) {
		preecheAluguel();
		aluguelDAO.inserir(aluguel);
		voltarTela();
	}

	public void voltarTela() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/fxmls/Menu.fxml"));
		try {
			AnchorPane agenciaView = (AnchorPane) loader.load();
			Main.root.setCenter(agenciaView);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void preecheAluguel() {
		aluguel = new Aluguel();

		aluguel.setCarroalugado(cbxVeiculo.getValue());
		aluguel.setCodigoaluguel(cbxVeiculo.getValue().getCodigoveiculo());
		aluguel.setDatafim(Date.valueOf(dtDataFim.getValue()));
		aluguel.setDatainicio(Date.valueOf(dtDataInicio.getValue()));
		aluguel.setLocatario(cbxCliente.getValue());
		aluguel.setSituacao(cbxSituacao.getValue().toString());
		aluguel.setValortotal(Double.valueOf(tfValorTotal.getText()));
	}

	private void populaCombos() {
		for (Veiculo veiculo : veiculodao.listar()) {
			cbxVeiculo.getItems().add(veiculo);
		}
		for (Cliente cliente : clienteDao.listar()) {
			cbxCliente.getItems().add(cliente);
		}

		cbxSituacao.getItems().add("EM ANDAMENTO");
	}

}
