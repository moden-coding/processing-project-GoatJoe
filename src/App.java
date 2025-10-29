import processing.core.*;
import processing.core.PShapeSVG.LineOfText;

public class App extends PApplet {
    boolean up = false;
    boolean left = false;
    float circlex = 700;
    float circley = 530;
    int rectr = 0;
    PImage football;
    float speed = 1;    
    float timer = millis();
        public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        // image
        football = loadImage("pixel art of an Amiel.png");
    
    }
    
    public void motion() {
        // motion
        println ("motion");
          if (left == true) {
            println("circle move left");
            circlex -= speed;
        }
        if (up == true) {
            println("circle move up");
            circley -= speed;
        }
    }

    public void settings() {
        size(800, 600);
    }

    public void time() {
        //timer
        println ("time");
         text("Time: " + timer + " seconds", 20, 20);

    }

    public void draw() {
        //image info
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
        time ();
        if (circlex > 290 && circlex < 490 && circley>60 && circley<320){
            text("You Won!", 200, 200);
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
