import processing.core.*;
import processing.core.PShapeSVG.LineOfText;

public class App extends PApplet{
    boolean colorred, colorblue, colorgreen;
    int circlex = 700; 
    int circley = 530;
    int rectr = 0;
    PImage football;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        colorblue = false;
        colorgreen = false;
        colorred = false;
        football = loadImage("Screenshot 2025-10-24 125417.png");
    }

    public void settings(){
        size(800,600);
    }

    public void draw(){
        background(10,0,255);
        fill (40,20,20);
       ellipse (circlex, circley, 50, 70);
       fill (200,0, 41);
       rect(20, 50, 50, 120);
       fill(255, 255, 0);
       rect (300, 60, 20, 260);
       fill(255, 255, 0);
       rect (500, 60, 20, 260);
       fill(255, 255, 0);
       rect (300, 320, 220, 30);
       rect (400, 350, 20, 200);
       imageMode(CENTER);
       image(football, 800,600,45,50);
     if (colorred == true){;
        circlex -= 40;
    }
    if (colorgreen == true){
        circlex += 0;
    }
    if (colorblue == true){
        circlex += 400;
    }
    if (frameRate%100 == 0){
        fill (random(255));
    }
    }
    public void keypressed(){
     if (keyCode == LEFT) {
    circlex -= 100;    
    circley -= 100;
     }
    }
}
