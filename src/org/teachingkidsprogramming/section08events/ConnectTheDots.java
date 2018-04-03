package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    setUpTheWindow();
    prepareColorPalette();
    //    Listen for left clicks on the window for the tortoise  --#1
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //    Listen for right clicks on the window for the tortoise  --#20.2
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    addDot(x, y);
  }
  private void addDot(int x, int y)
  {
    createCircle(x, y);
    Tortoise.moveTo(x, y);
  }
  private void createCircle(int x, int y)
  {
    //        createCircle at x and y (recipe below) --#2
    createCircle(x, y);
    //        ------------- Recipe for createCircle --#3.0 (everything in this recipe)
    //           Create a new circle with a radius of 11 using the next color on the color wheel 
    int radius = 11;
    Circle circle = new Circle(radius, ColorWheel, getNextColor());
    circle.setTransparency(60);
    circle.setCenter(x, y);;
    circle.addTo(Tortoise.getBackgroundWindow());
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    Clear everything from the window HINT: Use Tortoise --#7
    Tortoise.getBackgroundWindow().clearWindow()
  }
  private static void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  private void setUpTheWindow()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.hide();
  }
}
