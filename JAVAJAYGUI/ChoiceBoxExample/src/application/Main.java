package application;
	
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


public class Main extends Application implements ChangeListener<Number>{
	private TextField choiceBoxAdd;
	private ChoiceBox<String> choiceBox;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Set Stage properties
			primaryStage.setTitle("ChoiceBox Example");
			primaryStage.setResizable(false);
			
			// Create the ChoiceBox
			this.choiceBox = new ChoiceBox<String>();
			
			// Set ChoiceBox location and size
			AnchorPane.setTopAnchor(this.choiceBox, 40.);
			AnchorPane.setLeftAnchor(this.choiceBox, 40.);
			AnchorPane.setRightAnchor(this.choiceBox, 200.);
			AnchorPane.setBottomAnchor(this.choiceBox, 320.);
			
			// Adding choices
			this.choiceBox.getItems().add("Python");
			this.choiceBox.getItems().add("Java");
			this.choiceBox.getItems().add("C");
			this.choiceBox.getItems().add(3, "Go");
			
			// Two ways to programmatically select a choice
			this.choiceBox.getSelectionModel().select("C");
			this.choiceBox.getSelectionModel().select(0);
			
			// Register listener on ChoiceBox
			this.choiceBox.getSelectionModel().selectedIndexProperty().addListener(this);
			
			//Information Panel
			this.choiceBoxAdd = new TextField();
			AnchorPane.setTopAnchor(this.choiceBoxAdd, 200.);
			AnchorPane.setLeftAnchor(this.choiceBoxAdd, 160.);
			this.choiceBoxAdd.setText("Python");
			Text selection_text = new Text();
			AnchorPane.setTopAnchor(selection_text, 200.);
			AnchorPane.setLeftAnchor(selection_text, 40.);
			selection_text.setText("Choice Selection:");
			
			//Create a button to invoke alert dialog
			Button status = new Button();
			status.setText("STATUS");
			AnchorPane.setTopAnchor(status, 100.);
			AnchorPane.setLeftAnchor(status, 40.);
			
			//Create a button to invoke alert dialog 
			 Button add_choice = new Button();
			 add_choice.setText("Add");
			 AnchorPane.setTopAnchor(add_choice,  220.);
			 AnchorPane.setLeftAnchor(add_choice, 40.0);

			
			// Event based on button click
			EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
//					// Alert box to display messages
//					new Alert(AlertType.INFORMATION, choiceBox.getSelectionModel().getSelectedItem() + 
//							" Selection Cleared; Java Selected " + 
//							choiceBox.getSelectionModel().isSelected(1)).showAndWait();
//				
//					// Clear selection of ChoiceBox
//					choiceBox.getSelectionModel().clearSelection();
					
					//if there are too many items remove one
					if (choiceBox.getItems().size() == 5) {
						choiceBox.getItems().remove(0);
					}
					
					//add the new item to the choice box
					choiceBox.getItems().add(choiceBox.getItems().size(), choiceBoxAdd.getText());
					
					//Move the selected item to be the new First item
					choiceBox.getSelectionModel().select(0);
					
					//clear the text field
					choiceBoxAdd.clear();
				}
			};
			
			//Adding event Filter 
			status.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
			
			AnchorPane root = new AnchorPane();
			root.getChildren().addAll(choiceBox, choiceBoxAdd, status, selection_text);

			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number old_index, Number new_index) {
		if (((int)new_index >= 0) && this.choiceBoxAdd != null) {
			choiceBoxAdd.setText(choiceBox.getItems().get((Integer) new_index));
		}
	}
}
