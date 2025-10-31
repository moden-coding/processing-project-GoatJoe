import processing.core.*;
import processing.core.PShapeSVG.LineOfText;

public class App extends PApplet {
    boolean up = false;
    boolean screen1 = true;
    boolean left = false;
    float circlex = 700;
    float circley = 530;
    int rectr = 0;
    PImage football;
    float speed = 1;
    int startTime = 20000;
    int timer = 0;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        // image
        football = loadImage("pixel art of an Amiel.png");

    }

    public void motion() {
        // motion
        if (screen1 = false) {

            println("motion");
            if (left == true) {
                println("circle move left");
                circlex -= speed;
            }
            if (up == true) {
                println("circle move up");
                circley -= speed;
            }
        }
    }

    public void settings() {
        size(800, 600);
    }

    // stuff I deleted
    // public void time() {
    // //timer
    // println ("time");
    // text("Time: " + timer + " seconds", 20, 20);

    // }

    public void draw() {

        if (screen1 = true) {
            background(0, 0, 195);
            fill(255, 255, 0);
            textSize(72);
            text("Field GOAL!!!", 200, 90);
            fill(255, 255, 0);
            rect(290, 110, 20, 220);
            fill(255, 255, 0);
            rect(490, 110, 20, 220);
            fill(255, 255, 0);
            rect(390, 300, 20, 200);
            rect(290, 300, 220, 30);
            fill(10, 255, 0);
            textSize(22);
            text("Press Space To Start", 40, 560);
            fill(10, 255, 0);
            textSize(22);
            text("By  Noah  Zadeh", 613, 560);
            fill(10, 255, 0);
            textSize(12);
            text("An  NZ  prodution", 613, 582);
        } else {
            // image info
            strokeWeight(0);
            imageMode(CENTER);
            image(football, 400, 300, 950, 600);
            // football
            fill(40, 20, 20);
            ellipse(circlex, circley, 50, 70);
            // fill(200, 0, 41);
            // rect(20, 50, 50, 120);
            // field goal posts
            fill(255, 255, 0);
            rect(290, 60, 20, 260);
            fill(255, 255, 0);
            rect(490, 60, 20, 260);
            fill(255, 255, 0);
            rect(290, 320, 220, 30);
            rect(390, 350, 20, 200);
            // methods
            motion();
            // more stuff
            int time_left = max(0, timer - (millis() - startTime));
            int seconds = (int) (time_left / 1000.0);
            text("Time left: " + seconds + " seconds", 20, 20);
            if (circlex > 260 && circlex < 460 && circley > 50 && circley < 300) {
                text("You Won!", 200, 200);
            }
        }

    }

    // if (frameRate % 100 == 0) {
    // fill(random(255));
    // }
    // }

    public void keyPressed() {
        println("pressed up");
        // movement when key touched
        if (keyCode == UP) {
            up = true;
        }
        if (keyCode == LEFT) {
            left = true;
        }
       if (keyPressed = ){

       }
    }

    public void keyReleased() {
        println("released up");
        // stop when released
        if (keyCode == UP) {
            up = false;

        }

        if (keyCode == LEFT) {
            left = false;

        }
    }
}
