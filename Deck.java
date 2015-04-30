/*


*/
import java.util.ArrayList;


public class Deck 
{

   public static final int MAX_DECK_SIZE = 52;
   public static ArrayList<Card> cards; 
   
   public Deck()
   {
   this.cards = new ArrayList<Card>();


   newDeck();
   }


   public void newDeck()
   {
   
   
 
   

   
   for(int s=0; s<4; s++)
   {
   
   for(int r=0; r<13; r++)
   {
   cards.add(new Card(s,r));
   }
   
   }
   
   
   
   
   
   }
   
   public void addSuit(int s)
   {
      for (int i = 0; i<=12; i++)
         {
         cards.add(new Card(s, i));
         }
   
   
   
   }
   
   
   
   
   public boolean isEmpty()
   {
   return cards.isEmpty();
   }






  






}