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
	
	public GridPane getPane() {
		GridPane gridPane = new GridPane();
		
		for (int i = 0, k = 1; i < 12; i++) {
			if (i%4 == 0) {
				gridPane.add(new TextArea(getMonth(i)), i%4, ++k);
			} else {
				gridPane.add(new TextArea(getMonth(i)), i%4, k);
			}
		}
		return gridPane;
	}
	
	public Button getButton() {
		Button months = new Button("Months");
		return months;
	}
}