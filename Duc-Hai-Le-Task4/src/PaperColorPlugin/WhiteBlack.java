package PaperColorPlugin;

import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class WhiteBlack {
	
	public void setPaperColor(Scene scene) {
		scene.getStylesheets().add("white");
	}
	
	public Color getPenColor() {
		return Color.BLACK;
	}
}
