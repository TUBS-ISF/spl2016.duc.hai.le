import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * TODO description
 */
public class CalendaryProgram {
	public GridPane setPaperColor(GridPane gridPane) {
		gridPane.setStyle("-fx-background-color: red;");
		return gridPane;
	}
	
	public TextArea setPenColor(TextArea text) {
		text.setStyle("-fx-text-fill: white;");
		return text;
	}
}