package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Spiral
{
  public static void main(String[] args)
  
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Purples.BlueViolet);
    ColorWheel.addColor(PenColors.Purples.Lavender);
    ColorWheel.addcolor.(PenColors.Purples.Purple)
    for (int i = 0; i < 75; i++)
    {
    try
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(5 * i);
      Tortoise.turn(360 / 3);
    }
    catch (RuntimeException re)
    {
      MessageBox.showMessage("Hold up: " + re);
    }
  }
  }
}