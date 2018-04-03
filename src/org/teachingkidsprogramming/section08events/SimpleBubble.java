package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  ProgramWindow programWindow; //this is a class level variable (number variable)
  public SimpleBubble()
  {
    //    Create a ProgramWindow titled My Bubble --#1.1
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    //
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    //     ------------- Recipe for createBubble --#8.2
    //     Remove previous bubbles from your program window --#9
    //     Set the radius for the circle to a random number between 10 and 50 --#2.5
    Random random = new Random();
    int radius = random.nextInt(41) + 10;
    //     Create a circle with the radius and the next color from the color wheel --#2.1
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    //     Move the center of the bubble to the current position of the mouse on the window --#3
    circle.setCenter(x, y);
    circle.addTo(programWindow);
    //     Add the circle to your program window --#2.4
    //    ------------- End of createBubble recipe --#8.3
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}