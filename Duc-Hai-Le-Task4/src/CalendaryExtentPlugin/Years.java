package CalendaryExtentPlugin;

import java.util.Objects;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Years implements CalendaryExtentPlugin {
	
	public String getMonth(int number) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		return months[number];
	}
	
	public GridPane getPane(String color) {
		GridPane gridPane = new GridPane();
		
		for (int i = 0, k = 1; i < 12; i++) {
			
			TextArea textArea = new TextArea(getMonth(i));
			textArea.setStyle("-fx-text-fill: " + color +";");
			
			if (i%4 == 0) {
				gridPane.add(textArea, i%4, ++k);
			} else {
				gridPane.add(textArea, i%4, k);
			}
		}
		return gridPane;
	}
	
	public Button getButton() {
		Button months = new Button("Months");
		return months;
	}
}
