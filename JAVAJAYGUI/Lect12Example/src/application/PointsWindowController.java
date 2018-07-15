package application;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class PointsWindowController {
	@FXML
	private Label point1Label;
	@FXML
	private Label point2Label;

	public void setPointsLabels(double x1, double y1, double x2, double y2) {
		point1Label.setText("(" + x1 + "," + y1 + ")");
		point2Label.setText("(" + x2 + "," + y2 + ")");
	}
	
}
