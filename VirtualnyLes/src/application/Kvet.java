package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Kvet extends Rastlina {
	private Pane root;
	private double x;
	private double y;
	
    public Kvet(double x, double y, Pane root) {
    	this.root = root;
    	this.x = x;
    	this.y = y;
    	root.getChildren().addAll(this);
    }


    @Override
    public void vykresli() {
        int scale = 5;
        double stredX = x + 50;
        double stredY = y + 50;
        gc.clearRect(0, 0, getWidth(), getHeight());

        gc.setFill(Color.PINK);
        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI * i / 6;
            double petalX = stredX + (velkost * scale) * Math.cos(angle);
            double petalY = stredY + (velkost * scale) * Math.sin(angle);
            gc.fillOval(petalX - scale * 5, petalY - scale * 5, scale * 10, scale * 10);
        }

        gc.setFill(Color.RED);
        gc.fillOval(stredX - scale * 2.5, stredY - scale * 2.5, scale * 5, scale * 5);
    }
  
}