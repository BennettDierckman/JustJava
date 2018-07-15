package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;

public class LaunchPageController {
	@FXML
	private AnchorPane launchPagePane;
	@FXML
	private CheckBox cbSushi;
	@FXML
	private CheckBox cbPizza;
	@FXML
	private Button bOK;
	@FXML
	private Button bCancel;
	@FXML
	private Label lblMoveMe;
	
	//ok button event handler
	@FXML
	private void bOkClicked(ActionEvent event) {
		System.out.println("Ok button was clicked");
	}	
	//cancel button event handler
	@FXML
	private void bCancelClicked(ActionEvent event) {
		System.out.println("Cancel button was clicked");
	}
	//pizza check box event handler
	@FXML
	private void cbPizzaChecked(ActionEvent event) {
		if(cbPizza.isSelected())
			System.out.println("Pizza check box checked");
		else
			System.out.println("Pizza button was un checked");
	}
	//sushi check box event handler
	@FXML
	private void cbSushiChecked(ActionEvent event) {
		if(cbSushi.isSelected())
			System.out.println("Sushi check box was checked");
		else
			System.out.println("Sushi check box was un checked");	
	}
	//move me label event handler
	@FXML
	private void lblMoveMeMouseDragged(MouseEvent event) {
		lblMoveMe.relocate(event.getSceneX(), event.getSceneY());
	}
	//anchor pane key press event handler rgpb
	@FXML
	private void launchPagePaneKeyTyped(KeyEvent event) {	
		String c = event.getCharacter();
		switch(c) {
		case "R" : 
			lblMoveMe.setTextFill(Color.RED);
			System.out.println("Color Changed to Red");
			break;
		case "G" : 
			lblMoveMe.setTextFill(Color.GREEN);
			System.out.println("Color Changed to Green");
			break;
		case "B" : 
			lblMoveMe.setTextFill(Color.BLUE);
			System.out.println("Color Changed to Blue");
			break;
		case "P" : 
			lblMoveMe.setTextFill(Color.PURPLE);
			System.out.println("Color Changed to Purple");
			break;
		default: 
			System.out.println("Invalid key pressed");
		}
	}

}
