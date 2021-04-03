package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PaneLoginController {
	
	@FXML
	private void buttonLogin () {
	}
	@FXML
	private void onButtonAlert() {
	Alerts.showAlert("Aviso", "Login", "Senha ou Usuario incorreto", Alert.AlertType.WARNING);
	}
		
}
