package principal;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static BorderPane root;

	public void start(Stage primaryStage) throws Exception {
		try {
			root = (BorderPane) FXMLLoader.load(getClass().getResource("/fxmls/TelaPai.fxml"));
			Scene scene = new Scene(root, 1000, 620);
			primaryStage.setTitle("Locadora Veiculos");
			primaryStage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("/principal/application.css").toExternalForm());
			primaryStage.getIcons().add(new Image("file:/Imagens/imagembackground.jpg"));
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/fxmls/TelaLogin.fxml"));
			AnchorPane agenciaView = (AnchorPane) loader.load();
			root.setCenter(agenciaView);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		launch(args);
	}

	public static BorderPane getRoot() {
		return root;
	}

}