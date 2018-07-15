package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Window1Controller {
	@FXML private Label myLabel;
	@FXML private TextField textForWindow2Text;
	
	//window2 stage and controller, start with null
	private Stage window2Stage;
	private Window2Controller window2Controller;
	
	//accessor method to set the labvel on window1
	public void setLabel(String s) {
		myLabel.setText(s);
	}

	//Handler for button click
	@FXML
	public void buttonClick(ActionEvent event) {
		//if this is the first time in the button click, need to create the size dialog window
			if(window2Stage == null) {
				//get an fxml loader and read in the fxml code
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/Window2.fxml"));
				AnchorPane window2Pane;
				
				try {
					window2Pane = (AnchorPane) loader.load();
					Scene window2Scene = new Scene(window2Pane);
					window2Stage = new Stage();
					window2Stage.setScene(window2Scene);
					window2Stage.setTitle("Window 2");
					window2Controller = (Window2Controller) loader.getController();
					window2Controller.setController(this);
				}
				catch(IOException e) {
					e.printStackTrace();
				}	
				//show the window
				window2Controller.setLabel(textForWindow2Text.getText());
				window2Stage.show();
				textForWindow2Text.clear();
				System.out.println("After window2Stage.show()");
			}
	}
}
