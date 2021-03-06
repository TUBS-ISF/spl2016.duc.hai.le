package CalendaryExtentPlugin;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Months implements CalendaryExtentPlugin {
	
	public GridPane getPane(String color) {
		GridPane gridPane = new GridPane();
		
		String[] weekdays = {"Mo", "Tu", "We", "Thur", "Fri", "Sa", "Sun"};
		
		for (int i = 0; i < 7; i++) {
			TextArea text = new TextArea(weekdays[i]);
			text.setStyle("-fx-text-fill: " + color +";");
			gridPane.add(text, i, 0);
		}
		
		for (int i = 1, k = 1; i <= 31; i++) {
			if (i%7 == 0) {
				gridPane.add(new TextArea(i + ""), i%7, ++k);
			} else {
				gridPane.add(new TextArea(i + ""), i%7, k);
			}
		}
		return gridPane;
	}
	
	public Button getButton() {
		Button months = new Button("Months");
		return months;
	}
}
