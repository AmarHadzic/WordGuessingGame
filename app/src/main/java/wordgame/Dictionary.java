package wordgame;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dictionary
{
   private Scanner scanner;
   private String fileName;
   ArrayList<String> words;

   public Dictionary(String fileName)
   {
      this.fileName = fileName;
      words = new ArrayList<String>();
      readFromFile(); //reads words and adds them to arraylist
   
   }

   /*
    * Function to read all words from a given text file and adds each word to the arraylist
    */
   public void readFromFile()
   {
      try{
         File file = new File(this.fileName);
         scanner = new Scanner(file);
         while (scanner.hasNextLine())
         {
            String currentWord = scanner.nextLine();
            this.words.add(currentWord);
         }
      }catch(FileNotFoundException error)
      {
         System.out.println("Cannot find file");
      }

   }

   //returns arralist of words
   public ArrayList<String> getWords()
   {
      return this.words;
   }


}
