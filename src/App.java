import processing.core.*;
import processing.core.PShapeSVG.LineOfText;
import processing.event.KeyEvent;

public class App extends PApplet {
    boolean up = false;
    boolean Ball = false;
    boolean screen1 = true;
    boolean left = false;
    int circlex = 700;
    int circley = 530;
    int rectr = 0;
    PImage football;
    float speed = 2;
    int startTime = 65000;
    int timer = 0;
    boolean c = false;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        // image

        football = loadImage("pixel art of an Amiel.png");

    }

    public void motion() {
        // motion
        if (screen1 == false) {

            println("motion");
            if (left == true) {
                println("circle move left");
                circlex -= speed;
            }
            if (up = true) {
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

        if (screen1 == true) {
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
            text("Press Space In Less than 1 Sec To Start", 40, 560);
            fill(0, 5, 0);
            textSize(18);
            text("Rules: Get The Ball In The Post In 3 Seconds", 40, 410);
            fill(0, 5, 0);
            textSize(18);
            text("By Moving Both The Left And Up Key Only", 40, 430);
            fill(0, 5, 0);
            textSize(18);
            text("Rules: Get The Ball In The Post In 3 Seconds", 440, 410);
            fill(0, 5, 0);
            textSize(18);
            text("By Moving Both The Left And Up Key Only", 440, 430);
            fill(10, 255, 0);
            textSize(22);
            text("By  Noah  Zadeh", 613, 560);
            fill(10, 255, 0);
            textSize(12);
            text("An  NZ  prodution", 613, 582);
        } else if (screen1 == false) {
            // boolean ball
            if (Ball = true) {
                text("you win", 200, 200);
                speed = 0;
            }
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
            // time
            int time_left = max(0, timer - (millis() - startTime));
            int seconds = (int) (time_left / 20000.0);
            text("you have " + seconds + " left", 10, 10);
            if (circlex < 250 && circlex > 470 && circley < 50 && circley > 300 && time_left == 0) {
                Ball = true;
            }

            if (c = true) {
                speed = 0;
                background(0, 0, 195);
                fill(255, 55, 0);
                textSize(72);
                text("YOU MISSED!!!", 200, 90);
                textSize(372);
                fill(255, 0, 0);
                text("X", 308, 350);
                fill(0, 5, 0);
                textSize(22);
                text("Press B To Restart", 40, 560);
                fill(0, 5, 0);
                textSize(28);
                text("Are You Tyler Bass Because You Are Wide Right!", 120, 450);
                textSize(28);
                text("Pay Atention, You Got This Press B To Restart", 130, 488);
                time_left = max(0, timer - (millis() - startTime));
                seconds = (int) (time_left / 20000.0);
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
        if (key == ' ') {
            println("test");
            screen1 = false;
        }
        if (key == 'b') {
            screen1 = true;

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
