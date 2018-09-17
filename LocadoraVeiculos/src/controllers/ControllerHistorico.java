package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class ControllerHistorico {

	@FXML
	private Button btLimpar;

	@FXML
	private TableColumn<?, ?> tcIdHistoricoAluguel;

	@FXML
	private TableColumn<?, ?> tcHistoricoLocatario;

	@FXML
	private TableColumn<?, ?> tcHistoricoCarroAlugado;

	@FXML
	private TableColumn<?, ?> tcHistoricoDataInicio;

	@FXML
	private TableColumn<?, ?> tcHistoricoDataFim;

	@FXML
	private TableColumn<?, ?> tcHistoricoSituacao;

	@FXML
	private TableColumn<?, ?> tcHistoricoValorTotal;

	@FXML
	void limparHistorico(ActionEvent event) {

	}

}
