import processing.core.*;

public class App extends PApplet{
    boolean colorred, colorblue, colorgreen;
    int circlex = 400; 
    int circley = 400;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        colorblue = false;
        colorgreen = false;
        colorred = false;
    }

    public void settings(){
        size(800,800);
    }

    public void draw(){
        background(10,0,255);
       ellipse (circlex, circley, 50, 70);
       rect(200, 0, 250, 0);
     if (colorred == true){;
        circlex -= 400;
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
        circlex -= 10;
     }
    }
}
