/**
 * Main Activity class for Calendary providing window
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalendaryProgram extends Application{
	
	public static BorderPane root;
	public static String currentDay;
	public static String currentMonth;
	public static String currentWeek;
	public static String currentYear;
	public static String currentDate;
	
	public HBox addHBox() {
		HBox hbox = new HBox();
	    HBox hboxMiddle = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(300);
	    hbox.setAlignment(Pos.CENTER);
	    

        Button NewEvent = new Button("+");
        NewEvent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //add new Event to calendary
            }
        });
        hbox.getChildren().addAll(hboxMiddle);

	    return hbox;
	}
	
	
	public void start(Stage primaryStage) {
        
    	primaryStage.setTitle("Calendary v0.1");
          
        root = new BorderPane();
        HBox hbox = addHBox();
        root.setTop(hbox);  
        
        primaryStage.setScene(new Scene(root, 1200, 600));
        primaryStage.show();
    }


	public static void main (String[] args) {
        launch(args);
		
	}
}
