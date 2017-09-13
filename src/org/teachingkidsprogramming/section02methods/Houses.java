package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(200);
    int height = 40;
    drawhouse(height);
    height = 120;
    drawhouse(90);
    drawhouse(20);
  }
  private static void drawhouse(int height)
  {
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(Grays.LightGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static int height()
  {
    return 42;
  }
}
