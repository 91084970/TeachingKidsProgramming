package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    //  makeSlowTurtle (recipe below) --#4.0
    //  ------------- Recipe for makeSlowTurtle --#3.0
    //        Create a new slowTurtle instance 
    //        Add your slowTurtle to your MultiTurtleWindow
    //        Have your slowTurtle draw a upside down triangle with 50 pixel sides
    //  ------------- End of makeSlowTurtle --#3.1
    //  makeCrazyTurtle (recipe below) --#6.0
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    //        Create a new crazyTurtle instance  
    //        Add your crazyTurtle to your MultiTurtleWindow
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    speedyTurtle.drawTriangle(100);
  }
}
