package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Krik extends Rastlina {
	private Pane root;
	private double x;
	private double y;
	
	
    public Krik(double x, double y, Pane root) {
    	this.root = root;
    	this.x = x;
    	this.y = y;
    	root.getChildren().addAll(this);
    }


    @Override
    public void vykresli() {
    	double stredX = x + 50;
        double stredY = y + 50;
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.setFill(Color.GREEN);
        
        double bushSize = velkost * 10;
        
        for (int i = 0; i < 5; i++) {
            double offsetX = Math.random() * bushSize;
            double offsetY = Math.random() * bushSize;
            
            gc.fillOval(stredX + offsetX - (velkost * 10), stredY + offsetY  - (velkost * 10), bushSize, bushSize);
        }
    }
}