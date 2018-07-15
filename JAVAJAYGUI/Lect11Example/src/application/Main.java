package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//set a title for the window
			primaryStage.setTitle("KeyEvents");
			
			//get an FXML Loader and read in the fxml code
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/LaunchPage.fxml"));
			AnchorPane keyEventLayout = (AnchorPane) loader.load();
			
			//create the scene with the layout in the fxml code, set the scene and show it
			Scene scene = new Scene(keyEventLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
