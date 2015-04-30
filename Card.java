/*


*/


public class Card
{
   
   private int suit; 
   private int rank; 
   private boolean faceUp;
   
   
   
   
   /*
   
   
   */

   public Card(int s, int r)
   {
   this.suit = s;
   this.rank = r;
   faceUp = false;
   
   }
   
   
   
   public int getRank()
   {
   return rank;
   }
   
   
   public int getSuit()
   {
   return suit;
   }
   
   
   public boolean isFaceUp()
   {
   return faceUp;
   }
   
   
   
   
   
   public boolean equals (Object otherCard)
   {
   
   if(this.equals(otherCard))
      {
      return true;
      }
   else
      {
      return false;
      }   

   }
   
   
   





















}