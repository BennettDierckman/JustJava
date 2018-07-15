package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;

public class DrawingLaunchPageController {
	@FXML
	private AnchorPane mainPane;
	@FXML
	private Button addRectangleButton;
	@FXML
	private Button addLineButton;
	@FXML
	private RadioButton blueRadioButton;
	@FXML
	private RadioButton redRadioButton;
	@FXML
	private RadioButton greenRadioButton;
	
	//STAGES
	private Stage dialogStage;
	//CONTROLLERS
	private WarningDialogController dialogController;
	
	//addRectangleButton Event handler
	@FXML
	private void addRectangleButtonClick(ActionEvent event) {
		System.out.println("Add rectangle button clicked");
		
		//Create a rectangle in the screen at a random place
		Rectangle r = new Rectangle(Math.random() * 250, Math.random() * 190, 50, 30);
		
		//print the color the user specified, black if none selected
		Color c;
		if(blueRadioButton.isSelected())
			c = Color.BLUE;
		else if(redRadioButton.isSelected())
			c = Color.RED;
		else if (greenRadioButton.isSelected())
			c = Color.GREEN;
		else
			c = Color.BLACK;
		
		r.setStroke(c);
		r.setFill(c);
		mainPane.getChildren().add(r);
		
		//if this is the first time in the button click, need to create the size dialog window
		if(dialogStage == null) {
			//get an fxml loader and read in the fxml code
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/WarningDialog.fxml"));
			AnchorPane dialogRoot;
			
			try {
				dialogRoot = (AnchorPane) loader.load();
				Scene dialogScene = new Scene(dialogRoot);
				dialogStage = new Stage();
				dialogStage.setScene(dialogScene);
				dialogController = (WarningDialogController) loader.getController();
				dialogController.setColorLabel(c.toString());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			//show the window
			dialogStage.show();
			System.out.println("After dialogStage.show()");
		}
		else {
			dialogController.setColorLabel(c.toString());
		}
//		//get an FXML loader and read in the fxml code
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("/WarningDialog.fxml"));
//		AnchorPane dialogRoot;
//		try {
//			dialogRoot = (AnchorPane) loader.load();
//			Scene dialogScene = new Scene(dialogRoot);
//			Stage dialogStage = new Stage();
//			dialogStage.setScene(dialogScene);
//			WarningDialogController dialogController = (WarningDialogController) loader.getController();
//			dialogController.setColorLabel(c.toString());
//			dialogStage.show();
//			System.out.println("After dialogStage.show()");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}
	
	//addLineButton Event handler
		@FXML
		private void addLineButtonClick(ActionEvent event) {
			System.out.println("Add Line button clicked");
			double x = Math.random() *250;
			double y = Math.random() * 190;
			//Create a rectangle in the screen at a random place
			Line l = new Line(x, y, x+50, y+30);
			//print the color the user specified, black if none selected
			Color c;
			if(blueRadioButton.isSelected())
				c = Color.BLUE;
			else if(redRadioButton.isSelected())
				c = Color.RED;
			else if (greenRadioButton.isSelected())
				c = Color.GREEN;
			else
				c = Color.BLACK;
			l.setStroke(c);
			l.setFill(c);
			mainPane.getChildren().add(l);
			
			//get an FXML loader and read in the fxml code
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/PointsWindow.fxml"));
			AnchorPane pointsRoot;
			try {
				pointsRoot = (AnchorPane) loader.load();
				Scene pointsScene = new Scene(pointsRoot);
				Stage pointsStage = new Stage();
				pointsStage.setScene(pointsScene);
				PointsWindowController pointsController = (PointsWindowController) loader.getController();
				pointsController.setPointsLabels(x, y, x+50, y+50);
				pointsStage.show();
				System.out.println("After pointsStage.show()");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
