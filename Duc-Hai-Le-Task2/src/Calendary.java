import properties.PropertyManager;

import java.util.Objects;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calendary extends Application{
	
	public static BorderPane root;
	public static String currentDay;
	public static String currentMonth;
	public static String currentWeek;
	public static String currentYear;
	public static String currentDate;
	
	public HBox addHBox() {
		HBox hbox = new HBox();
	    HBox hboxMiddle = new HBox();
	    HBox hboxRight = new HBox();
	    HBox hboxLeft = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(300);
	    hbox.setAlignment(Pos.CENTER);
	    Button Days = new Button(),
	    		Months = new Button(),
	    		Weeks = new Button(),
	    		Years = new Button();

	    if (PropertyManager.getProperty("Days")) {
	        Days = new Button("Days");
	        Days.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                root.setCenter(addDaysView());
	            }
	        });
	    }
        
        if (PropertyManager.getProperty("Months")) {
	        Months = new Button("Months");
	        Months.setOnAction(new EventHandler<ActionEvent>() { 
	            @Override
	            public void handle(ActionEvent event) {
	            	root.setCenter(addMonthsView());
	            }
	        });
        }
        
        if (PropertyManager.getProperty("Weeks")) {
	        Weeks = new Button("Weeks");
	        Weeks.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	root.setCenter(addWeeksView());
	            }
	        });
        }
        
        if (PropertyManager.getProperty("Years")) {
	        Years = new Button("Years");
	        Years.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	            	root.setCenter(addYearsView());
	            }
	        });
        }
        Button NewEvent = new Button("+");
        NewEvent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // new Event
            }
        });
        
        TextField textField = new TextField();
        hboxRight.getChildren().addAll(textField);
	    hboxRight.setSpacing(5);
        hboxRight.setAlignment(Pos.CENTER_RIGHT);
        
        hboxMiddle.getChildren().addAll(Days, Weeks, Months, Years);
	    hboxMiddle.setSpacing(5);
	    hboxMiddle.setAlignment(Pos.CENTER);
	    
	    hboxLeft.getChildren().addAll(NewEvent);
        hboxLeft.setSpacing(5);
        hboxLeft.setAlignment(Pos.CENTER_LEFT);
        
        hbox.getChildren().addAll(hboxLeft, hboxMiddle, hboxRight);

	    return hbox;
	}
	
	
	public void start(Stage primaryStage) {
        
    	primaryStage.setTitle("Calendary v0.1");
          
        root = new BorderPane();
        
        HBox hbox = addHBox();
        
        //root.setAlignment(hbox, Pos.TOP_CENTER);
        root.setTop(hbox);
        
        
        
        primaryStage.setScene(new Scene(root, 1200, 600));
        primaryStage.show();
    }
	
	void setCurrentInformation() {
		
	}
	
	public GridPane addMonthsView() {
		GridPane gridPane = new GridPane();
		
		String[] weekdays = {"Mo", "Tu", "We", "Thur", "Fri", "Sa", "Sun"};
		for (int i = 0; i < 7; i++) {
			gridPane.add(new Text(weekdays[i]), i, 0);
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
	
	public GridPane addWeeksView() {
		
		GridPane gridPane = new GridPane();
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i < 7; i++) {
			gridPane.add(new Text(weekdays[i]), i, 0);
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
	
public GridPane addDaysView() {
		
		GridPane gridPane = new GridPane();
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i < 7; i++) {
			gridPane.add(new Text(weekdays[i]), i, 0);
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
	
	public GridPane addYearsView() {
		GridPane gridPane = new GridPane();
		
		for (int i = 0, k = 1; i < 12; i++) {
			if (i%4 == 0) {
				gridPane.add(new TextArea(getMonth(i, "en")), i%4, ++k);
			} else {
				gridPane.add(new TextArea(getMonth(i, "en")), i%4, k);
			}
		}
		return gridPane;
	}
	
	public String getMonth(int number, String language) {
		
		String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember" };
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		if (Objects.equals(language, "en")) return months[number];
		if (Objects.equals(language, "de")) return monate[number];
		return "";
	}


	public static void main (String[] args) {
		
		// Paper Color
		
		if (PropertyManager.getProperty("BlackWhite")) {
			System.out.println("BlackWhite selected");
		}
		if (PropertyManager.getProperty("WhiteBlack")) {
			System.out.println("WhiteBlack selected");
		}
		if (PropertyManager.getProperty("RedWhite")) {
			System.out.println("RedWhite selected");
		}
		if (PropertyManager.getProperty("WhiteRed")) {
			System.out.println("WhiteRed selected");
		}
		if (PropertyManager.getProperty("BlueWhite")) {
			System.out.println("BlueWhite selected");
		}
		if (PropertyManager.getProperty("WhiteBlue")) {
			System.out.println("WhiteBlue selected");
		}
		
		// Language
		
		if (PropertyManager.getProperty("English")) {
			System.out.println("English selected");
		}
		if (PropertyManager.getProperty("German")) {
			System.out.println("German selected");
		}
		
		// CalendaryExtent
		
		if (PropertyManager.getProperty("Months")) {
			System.out.println("Months selected");
		}
		if (PropertyManager.getProperty("Days")) {
			System.out.println("Days selected");
		}
		if (PropertyManager.getProperty("Weeks")) {
			System.out.println("Weeks selected");
		}
		if (PropertyManager.getProperty("Years")) {
			System.out.println("Years selected");
		}
		
		// ReminderFunction
		
		if (PropertyManager.getProperty("Audio")) {
			System.out.println("Audio selected");
		}
		if (PropertyManager.getProperty("PopUpWindow")) {
			System.out.println("PopUpWindow selected");
		}
		
		// SearchFunction
		
		if (PropertyManager.getProperty("SearchDate")) {
			System.out.println("SearchDate selected");
		}
		if (PropertyManager.getProperty("SearchCalendaryEntries")) {
			System.out.println("SearchCalendaryEntries selected");
		}
		
		// AuthorizedLogin
		
		if (PropertyManager.getProperty("AuthorizedLoginNecessary")) {
			System.out.println("AuthorizedLoginNecessary selected");
		}
		if (PropertyManager.getProperty("NoAuthorizedLogin")) {
			System.out.println("NoAuthorizedLogin selected");
		}
		
        launch(args);
		
	}
}