package PaperColorPlugin;

import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class WhiteBlue {

	public Scene setPaperColor(Scene scene) {
		scene.getStylesheets().add("white");
		return scene;
	}
	
	public Color getPenColor() {
		return Color.BLUE;
	}
}
