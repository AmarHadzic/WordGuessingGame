package wordgame;

import java.util.ArrayList;

public class RepeatedGuess
{
    private ArrayList< Character > guessedLetters; //arraylist of chars

    public RepeatedGuess()
    {
        this.guessedLetters = new ArrayList<Character>(); //instantiates arraylist

    }

    public ArrayList<Character> getGuessedLetters()
    {
        return this.guessedLetters; //returns the arraylist of guessed letters
    }

    /*
     * this function adds the lowercase version of any letter to the arraylist if it is not already in it
     */
    public void addLetter(char letter)
    {
        if ( !this.guessedLetters.contains(Character.toLowerCase(letter)) )
        {
            this.guessedLetters.add(Character.toLowerCase(letter));
        }

    }

    /*
     * this function checks if a letter was already guessed by doing contains() 
     * of the lower case version of inputted letter
     */
    public boolean checkGuessed(char letter)
    {
        return this.guessedLetters.contains(Character.toLowerCase(letter));
    }

}