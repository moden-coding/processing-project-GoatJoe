import processing.core.*;
import processing.core.PShapeSVG.LineOfText;

public class App extends PApplet {
    boolean colorred = false;
    float circlex = 700;
    float circley = 530;
    int rectr = 0;
    PImage football;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup(){
                football = loadImage("pixel art of an Amiel.png");
    }

    public void settings() {
        size(800, 600);
    }

    public void draw() {
     
        imageMode(CENTER);
        image(football, 400, 300, 950, 600);
        fill(40, 20, 20);
        ellipse(circlex, circley, 50, 70);
        fill(200, 0, 41);
        rect(20, 50, 50, 120);
        fill(255, 255, 0);
        rect(290, 60, 20, 260);
        fill(255, 255, 0);
        rect(490, 60, 20, 260);
        fill(255, 255, 0);
        rect(290, 320, 220, 30);
        rect(390, 350, 20, 200);
   if (colorred == true) {
            circlex -= 40;
        }
        
        
        if (frameRate % 100 == 0) {
            fill(random(255));
        }
    }

    public void keypressed() {
        if (keyCode == UP) {
            colorred = true; 
        }
    }

    public void keyReleased() {
        if(keyCode==UP){
            colorred = false;
        }
    }
}
