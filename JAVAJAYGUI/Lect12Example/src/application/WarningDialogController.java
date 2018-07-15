package application;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class WarningDialogController {
	@FXML
	private Label colorLabel;
	
	public void setColorLabel(String s) {
		colorLabel.setText(s);
	}

}
