/*
Tyler Johnson
CS 110
 

*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class War
{
   
   
   public War()
   {
  // Game game = new Game();
   

// public static void main(String [] args) 
//    {

   
   Scanner s = new Scanner(System.in);
   Deck pile = new Deck();
   
//    for(Card c : pile.cards)
//    {
//    System.out.println(c.getRank()+"\t"+c.getSuit());
//    }

   Random rand = new Random();
   
   //use the random object rand to shuffle the deck of cards pile
   for(int i = 0; i<pile.cards.size(); i++)
   {
   int randPosition = rand.nextInt(pile.cards.size());
   Card temp = pile.cards.get(i);
   pile.cards.set(i, pile.cards.get(randPosition));
   pile.cards.set(randPosition, temp);
   }
   
   
   
   
//    for(Card c : pile.cards)
//    {
//    System.out.println(c.getRank()+"\t"+c.getSuit());
//    }
//    
   
   
   //create stacks and queues for player 1 and player 2
   StackReferenceBased player1 = new StackReferenceBased();
   StackReferenceBased player2 = new StackReferenceBased();
   QueueReferenceBased player1q = new QueueReferenceBased();
   QueueReferenceBased player2q = new QueueReferenceBased();
   
   //push first 26 cards of shuffled pile to player 1 stack, second half to player 2 stack
   for (int i = 0; i<pile.cards.size(); i++)
      
     {
         if(i<26)
         {
         Card temp = pile.cards.get(i);
         player1.push(temp);
         }
         else if(i>26 && i<pile.cards.size())
         {
         Card temp = pile.cards.get(i);
         player2.push(temp);
         }
       
     }
   
  
  
   //test
//    while(!(player1.isEmpty()))
//    {
//    Card temp = player1.pop();
//    
//    System.out.println(temp.getRank()+"\t"+temp.getSuit());
//    }
  // 
   
   

   //declare variables 
   boolean player1Wins = false;
   boolean player2Wins = false;
   
   boolean flag = true;
   boolean war_flag = true;
   //temporary card objects
   Card temp1;
   Card temp2;
   int temp_1;
   int temp_2;
   
   //use try block to catch stack exceptions 
   try
   {
   while(flag!=false)
   {
   
   //pop front cards from stacks for player 1 and 2
   //use temp variables to hold rank of cards
   temp1 = player1.pop();
   temp2 = player2.pop();
   temp_1 = temp1.getRank();
   temp_2 = temp2.getRank();
   //if/else to compare rank of cards
   
         if(temp_1 > temp_2)
         {
         //remove each card item in stack, add each card to the end of the queue
            while(!player1.isEmpty())
            {
            player1q.enqueue(player1.pop());
            }
            //add both players cards for the round to the end of the queue
            player1q.enqueue(temp1);
            player1q.enqueue(temp2);
            //add each item in queue to stack
            while(!player1q.isEmpty())
            {
            player1.push(player1q.dequeue());
            }
            
         System.out.println("temp_1 wins");
         
         }
         //if player 2 has a higher ranking card, add both cards to end of player 2 deck
         else if(temp_2 > temp_1)
         {
            
            while(!player2.isEmpty())
            {
            player2q.enqueue(player2.pop());
            }
            player2q.enqueue(temp1);
            player2q.enqueue(temp2);
            
           while(!player2q.isEmpty())
            {
            player2.push(player2q.dequeue());
            }
            
         System.out.println("temp_2 wins");
         
         
         }
         //if cards rank is the same, both players 
         else
         {
         System.out.println("War!");
               
               
               while(war_flag!=false)
               {
               temp1 = player1.pop();
               temp2 = player2.pop();
               temp_1 = temp1.getRank();
               temp_2 = temp2.getRank();
               
               if(temp_1!=temp_2)
               
                  {
                  war_flag = false;
                  
                  }
                  else if (temp_1>temp_2)
                  {
                  
                  System.out.println("temp_1 wins");
                  while(!player1.isEmpty())
                  {
                  player1q.enqueue(player1.pop());
                  }
                  player1q.enqueue(temp1);
                  player1q.enqueue(temp2);
                  
                  while(!player1q.isEmpty())
                  {
                  player1.push(player1q.dequeue());
                  }

                  }
                  else if (temp_2>temp_1)
                  {
                  while(!player2.isEmpty())
                  {
                  player2q.enqueue(player2.pop());
                  }
                  player2q.enqueue(temp1);
                  player2q.enqueue(temp2);
                  
                 while(!player2q.isEmpty())
                  {
                  player2.push(player2q.dequeue());
                  }

                  System.out.println("temp_2 wins");
                  }
                  
                  
                  else
                  {
                  System.out.println("error");
                  }
                  
               
               //end of while loop for war
               }
         
         
         }
   

   
   
   
   if(player1.isEmpty())
   {
   flag = false;
   player2Wins = true;
   
   }
   else if (player2.isEmpty())
   {
   flag = false;
   player1Wins = true;
   }
   else
   {
   System.out.println("----------------------");
    // System.out.println("----------------------");
//       System.out.println("----------------------");

   }
   
   //end of while loop for game 
   }
   }catch(StackException e)
                  {
                  
                  }
   
   
  
  
  
  System.out.println("----------------------");
  if (player1Wins == true)
  {
    System.out.println("-----------player1 wins-----------");
   }
   else
   {
      System.out.println("-------------player2 wins---------");
  }
  
  while(!player1q.isEmpty())
  {
  
  Card temp = player1q.dequeue();
  System.out.println(temp.getRank()+"\t"+temp.getSuit());
  
  
  }
  
  
  
  

   //}
}








}
