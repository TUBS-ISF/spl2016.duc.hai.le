import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * TODO description
 */
public class CalendaryProgram {
	public HBox addHBox() {
		HBox hbox = original();
		
        Button Years = new Button("Years");
        Years.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	root.setCenter(addYearsView());
            }
        });
		
		return hbox;
	}
	
	public GridPane addYearsView() {
		
		GridPane gridPane = new GridPane();
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		for (int i = 0, k = 1; i < 12; i++) {
			TextArea text = new TextArea(months[i]);
			text = setPenColor(text);
			if (i%4 == 0) {
				gridPane.add(text, i%4, ++k);
			} else {
				gridPane.add(text, i%4, k);
			}
		}
		gridPane = setPaperColor(gridPane);
		
		return gridPane;
	}
	
	public GridPane setPaperColor(GridPane gridPane) {
		gridPane.setStyle("-fx-background-color: white;");
		return gridPane;
	}
	
	public TextArea setPenColor(TextArea text) {
		text.setStyle("-fx-text-fill: black;");
		return text;
	}
}