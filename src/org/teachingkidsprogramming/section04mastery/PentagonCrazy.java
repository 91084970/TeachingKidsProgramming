package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8.1
    // 
    //    drawPentagon (recipe below) --#10.1
    //
    //    ------------- Recipe for drawPentagon --#10.2
    for (int i = 0; i < 200; i++)
    {
      //    Do the following 200 times --#2.1
      adjustPen();
      int length = i;
      Tortoise.move(length);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
    //        Turn the tortoise 1 more degree --#5
    //    End Repeat --#2.2
    //    ------------- End of drawPentagon recipe --#10.3
  }
  private static void adjustPen()
  {
    //    ------------- Recipe for createColorPalette --#8.2
    //    Add steel blue to the color wheel --#7
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    //    Add dark slate blue to the color wheel --#12
    //    Add teal to the color wheel --#13
    //    Add indigo to the color wheel --#14
    //    ------------- End of createColorPalette recipe --#8.3
  }
}
