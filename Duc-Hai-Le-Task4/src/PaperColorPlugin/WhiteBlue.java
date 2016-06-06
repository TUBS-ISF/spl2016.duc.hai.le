package PaperColorPlugin;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class WhiteBlue {

	public GridPane setPaperColor(GridPane gridPane) {
		gridPane.setStyle("-fx-background-color: white;");
		return gridPane;
	}
	
	public String getPenColor() {
		return "blue";
	}
}
