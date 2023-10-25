package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Strom extends Rastlina {
	private Pane root;
	private double x;
	private double y;
	
    public Strom(double x, double y, Pane root) {
    	this.root = root;
    	this.x = x;
    	this.y = y;
    	root.getChildren().addAll(this);
    }


    @Override
    public void vykresli() {
    	int velkost_koruna = 20;
    	int scale = velkost * 10;
    	int kmen = 10;
    	double stredX = x + 35;
        double stredY = y + 50;
        gc.clearRect(0, 0, getWidth(), getHeight());

        Color listieFarba = generujNahodnuFarbu();

        gc.setFill(listieFarba);
        gc.fillOval(stredX - (scale + velkost_koruna) / 2, stredY - (scale + velkost_koruna), scale + velkost_koruna, scale + velkost_koruna);

        Color kmenFarba = Color.BROWN;

        gc.setFill(kmenFarba);
        gc.fillRect(stredX - (kmen/2), stredY, kmen, 50);
    }

    private Color generujNahodnuFarbu() {
        double red = Math.random();
        double green = Math.random();
        double blue = Math.random();
        return new Color(red, green, blue, 1.0);
    }

}
