package PaperColorPlugin;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class BlueWhite {
	
	public GridPane setPaperColor(GridPane gridPane) {
		gridPane.setStyle("-fx-background-color: blue;");
		return gridPane;
	}
	
	public String getPenColor() {
		return "white";
	}
}
