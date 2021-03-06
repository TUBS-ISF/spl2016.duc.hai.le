package CalendaryExtentPlugin;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Days implements CalendaryExtentPlugin {
	
	public GridPane getPane(String color) {
		GridPane gridPane = new GridPane();
		
		for (int i = 0; i < 24; i++) {
			TextArea textArea = new TextArea("" + (i%24) + ":00");
			textArea.setStyle("-fx-text-fill: " + color +";");
			gridPane.add(textArea,  0, i);
		}
		return gridPane;
	}
	
	public Button getButton() {
		Button days = new Button("Days");
		return days;
	}
}
