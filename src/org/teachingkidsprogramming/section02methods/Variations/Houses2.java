package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses2
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Morelia");
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
    //Change the pen color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    //draw flat roof();  
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawflatroof()
  {
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(90);
  }
  private static int height()
  {
    return 42;
  }
}
