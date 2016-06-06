package CalendaryExtentPlugin;

import java.util.Objects;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Weeks implements CalendaryExtentPlugin {
	
	public String getWeek(int number) {
		String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		return weeks[number];
	}
	
	public GridPane getPane() {
		GridPane gridPane = new GridPane();
		
		for (int i = 0; i < 7; i++) {
			gridPane.add(new Text(getWeek(i)), i, 0);
		}
		
		for (int i = 0, k = -1; i < (7*24); i++) {
			if (i%24 == 0) {
				gridPane.add(new TextArea("" + (i%24) + ":00"),  ++k, i%24+1);
			} else {
				gridPane.add(new TextArea("" + (i%24) + ":00"), k, i%24+1);
			}
		}
		return gridPane;
	}
	
	public Button getButton() {
		Button months = new Button("Months");
		return months;
	}
}