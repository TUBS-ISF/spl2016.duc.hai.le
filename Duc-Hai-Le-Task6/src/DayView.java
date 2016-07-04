import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

aspect DayView {
	
	after(): execution(GridPane addDaysView(void)) {
		System.out.println("Aspect Day-Feature inserted.";
	}
	
	public HBox Calendary.addHBox() {
		Button Days = new Button("Days");
	    Days.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
	        	GridPane daysView = addDaysView();
	        	root.setRight(daysView);
	        	String[] currentInformation = getCurrentInformation();         	
	        	Label text = new Label(currentInformation[1] + "\n" + currentInformation[0]);
	        	text.setContentDisplay(ContentDisplay.RIGHT);
	        	text.setFont(new Font("Railway", 32));
	        	root.setLeft(text);
	        	root.setCenter(null);
	        }
	    });   
	}
	
	public GridPane Calendary.addDaysView() {
		
		GridPane gridPane = new GridPane();
		
		for (int i = 0; i < 24; i++) {
			gridPane.add(new TextArea("" + (i%24) + ":00"),  0, i);
		}
		
		return gridPane;
	}
	
}