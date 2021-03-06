package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class RecursiveSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    //
    //  Set the speed to the fastest --#8
    double length = 100.0;
    //  MakeASquare with the current length(recipe below) --#11.4
    //
    //  Create the makeASquare recipe --#11.1
    //  If the current length is greater than 10 --#10.2
    //      Run the recipe moveToTheSquareStart with the current length  --#4.3
    MoveBackToCenter(length);
    //
    //      Create the moveToTheSquareStart recipe  --#4.1
    Tortoise.setPenUp();
    Tortoise.move(length / 2);
    Tortoise.turn(-90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
    //  Do the following 4 times --#7.1
    for (int i = 0; i < 4; i++)
      Tortoise.move(length);
    //    MakeASquare with the current length divided by 1.7 (recipe below)--#11.3 
    //      If the current process count is less than 3 (HINT: use 'i') --#9
    if (i < 3)
    {
      //          Turn the tortoise 90 degrees to the right --#6.1
      Tortoise.turn(90);
    }
    //  End Repeat --#7.2
  }
  //
  //  MoveBackToCenter with the current length (recipe below)--#5.3
  //
  //  Set the current length to the current length times two --#10.1
  length=length*2
  //
  //  End of makeASquare recipe --#11.2
  }
  private static void MoveBackToCenter(double length)
  {
  }
  private static void moveBackToCenter(double length)
  {
    //  Create the moveBackToCenter recipe --#5.1
    Tortoise.setPenUp();
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
    //
    //
    //  End of moveBackToCenter recipe--#5.2
  }
}
