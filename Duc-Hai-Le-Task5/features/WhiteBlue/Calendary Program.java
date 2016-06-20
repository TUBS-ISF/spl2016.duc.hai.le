import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * TODO description
 */
public class CalendaryProgram {
	public GridPane setPaperColor(GridPane gridPane) {
		gridPane.setStyle("-fx-background-color: white;");
		return gridPane;
	}
	
	public TextArea setPenColor(TextArea text) {
		text.setStyle("-fx-text-fill: blue;");
		return text;
	}
}