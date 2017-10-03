package org.teachingkidsprogramming.section02methods;

public class SequencialExecution01
{
  //looking at the sequential execution
  public static void main(String[] args)
  {
    System.out.println("In main #1");
    myMethod1();
    System.out.println("In main #2");
  }//end of main method
  public static void myMethod1()
  {
    System.out.println("In myMethod #1 ");
    myMethod2();
  }
  public static void myMethod2()
  {
    System.out.println("In myMethod #1");
    myMethod3();
   
   }
  public static void myMethod3()
  {
      System.out.println("In myMethod3 #1");
      myMethod2();
  }
    
  }
}//end of class
