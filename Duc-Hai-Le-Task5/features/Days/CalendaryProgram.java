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

        Button Days = new Button("Days");
        Days.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.setCenter(addDaysView());
            }
        });
		
		return hbox;
	}
	
	public GridPane addDaysView() {
		
		GridPane gridPane = new GridPane();
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i < 7; i++) {
			gridPane.add(new Text(weekdays[i]), i, 0);
		}
		
		for (int i = 0, k = -1; i < (7*24); i++) {
			TextArea text = new TextArea("" + (i%24) + ":00");
			text = setPenColor(text);
			if (i%24 == 0) {
				gridPane.add(text,  ++k, i%24+1);
			} else {
				gridPane.add(text, k, i%24+1);
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