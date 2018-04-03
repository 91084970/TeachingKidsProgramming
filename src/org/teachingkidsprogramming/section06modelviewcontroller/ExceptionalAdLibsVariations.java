package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVariations
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    //end of main
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Y dont your want to play? To start you need one adverb ");
      askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs, try again");
      askAdverb();
    }
    return adverb;
  }// end of method
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput(" dkdlkdldl");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("kjdkdjd");
    }
  }
}//end of class
