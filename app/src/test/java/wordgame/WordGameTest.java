package wordgame;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class WordGameTest
{
    private RepeatedGuess test;

    @Before
    public void setUp()
    {
        this.test = new RepeatedGuess();
        test.addLetter('a');
        test.addLetter('w');
        test.addLetter('Z');
    }

    @After
    public void tearDown()
    {
        this.test = null; 
    }

    @Test
    public void addingLettersTest()
    {
        test.addLetter('B');

        int numLetters = test.getGuessedLetters().size();

        assertEquals("addLetter() ", 4, numLetters);
    }

    @Test
    public void checkGuessedCaseSensitiveAssertTrue()
    {
        boolean result = test.checkGuessed('A');

        assertEquals("checkGuessed() with case sensitive", true, result);
    }

    @Test
    public void checkGuessedAssertFalse()
    {
        boolean result = test.checkGuessed('P');

        assertEquals("checkGuessed() ", false, result);
    }

    @Test
    public void checkGuessedNonCaseSensitiveAssertTrue()
    {
        boolean result = test.checkGuessed('a');

        assertEquals("checkGuessed() without case sensitive ", true, result);
    }

    @Test
    public void getGuessedLettersReturnsArrayListTest()
    {
        ArrayList<Character> arrayList = new ArrayList<Character>();

        assertEquals("getGuessedLetters() returns an ArrayList of characters ", arrayList.getClass(), test.getGuessedLetters().getClass());

    }

    @Test
    public void getGuessedLettersTest()
    {
        test.addLetter('a');
        test.addLetter('p');
        test.addLetter('q');

        ArrayList<Character> guessedChars = test.getGuessedLetters();

        assertEquals("Should return an arraylist of size 5", 5, guessedChars.size());
    }
    
}   

