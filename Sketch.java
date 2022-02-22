import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // Set size of application
    size(700, 700);
  }

  /**
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Set background colour to sky blue
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(4);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect((float) (width/-20), (float) (height/1.06), (float) (width/0.9), height);

    // Fill everything else in white
    fill(255, 255, 255);

    // Stroke settings for ears
    strokeWeight(10);
    stroke(0);

    // Ears
    triangle((float) (width/3.33),(float) (height/3.8),(float) (width/3.07),height/10,(float) (width/2.35),(float) (height/5.33));
    triangle((float) (width/1.42),(float) (height/3.8),(float) (width/1.48),height/10,(float) (width/1.74),(float) (height/5.33));
    circle(width/2, height/2, (float) (width/1.6));

    // Set stroke settings for eyes and mouth
    strokeWeight(7);

    // Eyes and mouth
    arc((float) (width/2.66), (float) (height/2.28), width/8, height/8, -PI, 0);
    arc((float) (width/1.6), (float) (height/2.28), width/8, height/8, -PI, 0);
    arc(width/2, (float) (height/1.77), width/16, height/16, 0, PI);

    // Stroke settings for body
    strokeWeight(2);
    stroke(0);

    // Lines for body
    line(width/2, (float) (height/1.23), width/2, (float) (height/1.14));
    line(width/2, (float) (height/1.14), (float) (width/2.10), (float) (height/1.069));
    line(width/2, (float) (height/1.14), (float) (height/1.9), (float) (height/1.069));
    line(width/2, (float) (height/1.18), (float) (width/2.22), (float) (height/1.17));
    line(width/2, (float) (height/1.18), (float) (height/1.81), (float) (height/1.17));
  }
}