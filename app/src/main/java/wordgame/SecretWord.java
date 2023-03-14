package wordgame;

public class SecretWord
{
   private char    []secret;
   private boolean []opened;
   public SecretWord(String word)
   {
      this.secret = word.toCharArray();
      this.opened = new boolean[secret.length];
   }

   public boolean makeGuess(char letter)
   {
      boolean result = false;
      for (int i = 0; i < this.secret.length; i++)
      {
         if( Character.toLowerCase(this.secret[i]) == Character.toLowerCase(letter) && !this.opened[i])
         {
            result = true;
            this.opened[i] = true;
         }
      }

      return result;
   }

   public boolean hasUnopenedLetters()
   {
      for (int i = 0; i < this.opened.length; i++)
      {
         if (!this.opened[i])
         {
            return true;
         }
      }
      return false;
   }

   public String getCurrentGuess()
   {
      String result = "";
      for (int i = 0; i < this.opened.length; i++)
      {
         if (this.opened[i])
         {
            result+=this.secret[i];
         }
         else
         {
            result+='_';
         }
      }
      return result;
   }

   public String reveal()
   {
      String result = new String(this.secret);
      return result;
   }
}
