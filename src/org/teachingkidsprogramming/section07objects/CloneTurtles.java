package org.teachingkidsprogramming.section07objects;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CloneTurtles
{
  public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  public MultiTurtleWindow mtw     = new MultiTurtleWindow();
  //
  public CloneTurtles()
  {
    showSomeTurtles();
  }
  //
  private void showSomeTurtles()
  {
    // Use a FOR loop to add your three turtles --#4.1
    Turtle turtle = new Turtle();
    mtw.addTurtle(turtle);
    
    // End Repeat --#4.2
    //
    // Create a variable to count the number of turtles in the container --#3.1
    int numberOfTurtles = mtw.getTurtleCount();
    // Uncomment to Show the number of turtles in the container on the window --#3.2
    new Text("There are" + numberOfTurtles + " turtles in the turtle container").setTopLeft(50,50)
    .setPenColor(PenColors.Yellows.Gold).addTo(mtw);
    
    // new Text("There are " + numberOfTurtles + " turtles in the turtle container").setTopLeft(50, 50).setPenColor(PenColors.Yellows.Gold).addTo(mtw);
    
    // Use a FOREACH loop to add your turtles to your window --#5.1
    //      Add and Show your turtles on your window --#5.3
    // End Repeat --#5.2
    //
    // Use a FOR loop to teleport all of your turtles around your window  --#6.1
    //      Get your turtle's current position and then set the X position to i*100 + 350 --#6.3
    turtles.get(i).setX(i * 100 + 350);
    turtles.get(i)numberOfTurtles.setY(i * 100 + 100);
    // End Repeat --#6.2
    //
    // Use a FOREACH loop to set values for all of your turtles --#7.1
    for (Turtle turtle : turtles)
    {
     turtle 
    //      Set the pen width to 10 pixels -- #7.3
    //      Set the turtle speed to 9 --#7.4
    //      Have each turtle draw a star with a side that is 100 pixels --#7.5
    // End Repeat --#7.2
    }
  }
  //
  public static void main(String[] args)
  {
    new CloneTurtles();
  }
}
