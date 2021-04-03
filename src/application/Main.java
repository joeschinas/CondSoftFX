package application;
	
import java.io.IOException;
import java.sql.Connection;

import db.DB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/PaneLogin.fxml"));
			 Scene scene = new Scene(parent);
			 stage.setScene(scene);
			 stage.show();
			}
			catch (IOException e) {
			e.printStackTrace();
			}
			
	}
	
	public static void main(String[] args) {
		launch(args);
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

	
}
