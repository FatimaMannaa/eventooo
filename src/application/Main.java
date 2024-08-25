package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {		
			
		Parent loginfxml = FXMLLoader.load(getClass().getResource("/auth/login.fxml"));
		
		Scene loginScene= new Scene(loginfxml);
		loginScene.getStylesheets().add(getClass().getResource("/application.css").getDefaultPort());
		stage.setScene(loginScene);
		stage.setTitle("login");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
