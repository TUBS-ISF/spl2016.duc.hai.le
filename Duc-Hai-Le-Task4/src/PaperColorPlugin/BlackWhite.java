package PaperColorPlugin;

import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class BlackWhite {
	
	public void setPaperColor(Scene scene) {
		scene.getStylesheets().add("black");
	}
	
	public Color getPenColor() {
		return Color.WHITE;
	}
}
