package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class Window2Controller {
	@FXML private Label myLabel;
	@FXML private TextField textForWindow1Text;
	
	//controller for window 1 so we can set its label
	private Window1Controller window1Controller;
	
	//accessor method for window1controller to call
	public void setController(Window1Controller c) {
		window1Controller = c;
	}
	
	//accessor method for label
	public void setLabel(String s) {
		myLabel.setText(s);
	}

	//handler for button click
	@FXML
	public void buttonClick(ActionEvent event) {
		//set the label on window 1 with out textfield
		window1Controller.setLabel(textForWindow1Text.getText());
		textForWindow1Text.clear();
	}
}
