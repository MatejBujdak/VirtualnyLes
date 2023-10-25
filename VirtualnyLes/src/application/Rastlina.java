package application;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Rastlina extends Canvas {

    protected int velkost;
    private int maxVelkost = 5;
    protected GraphicsContext gc = this.getGraphicsContext2D();;

    public Rastlina() {
    	super(750, 600);
    	setLayoutY(0); 
    	setLayoutX(50); 
        this.velkost = 1;
        gc = this.getGraphicsContext2D();
        
        Timeline timeline = new Timeline(
        new KeyFrame(Duration.seconds(1), e -> rast()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        
        
    }

    public void rast() {
        velkost++;
        if (velkost > maxVelkost) {
            velkost = 1;
        }
        vykresli();
    }
    
    public void vykresli() {
    	
    }

}


