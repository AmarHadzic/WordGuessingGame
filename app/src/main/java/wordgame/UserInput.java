package wordgame;

import java.util.Scanner;
public class UserInput
{
   public static char getNextLetter()
   {
      Scanner scanner = new Scanner(System.in);
      return scanner.next().charAt(0);
   }

   public static void askForInput()
   {
      System.out.println("Guess a letter: ");
   }
}
