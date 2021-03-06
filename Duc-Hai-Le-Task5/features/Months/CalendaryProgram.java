import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * TODO description
 */
public class CalendaryProgram {
	public HBox addHBox() {
		HBox hbox = original();
		
        Button Months = new Button("Months");
        Months.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {
            	root.setCenter(addMonthsView());
            }
        });
        
		return hbox;
	}
	
	public GridPane addMonthsView() {
		GridPane gridPane = new GridPane();
		
		String[] weekdays = {"Mo", "Tu", "We", "Thur", "Fri", "Sa", "Sun"};
		for (int i = 0; i < 7; i++) {
			gridPane.add(new Text(weekdays[i]), i, 0);
		}
		
		for (int i = 1, k = 1; i <= 31; i++) {
			TextArea text = new TextArea(i + "");
			if (i%7 == 0) {
				text = setPenColor(text);
				gridPane.add(text, i%7, ++k);
			} else {
				gridPane.add(text, i%7, k);
			}
		}
		setPaperColor(gridPane);
		return gridPane;
	}
	
	public GridPane setPaperColor(GridPane gridPane) {
		gridPane.setStyle("-fx-background-color: black;");
		return gridPane;
	}
	
	public TextArea setPenColor(TextArea text) {
		text.setStyle("-fx-text-fill: black;");
		return text;
	}
}