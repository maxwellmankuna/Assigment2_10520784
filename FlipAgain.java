
 

package assignment2_10520784;


    

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author Maxwell
 */
public class FlipAgain 
{
    public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		Random r = new Random();
                String answer;
              do{
                System.out.println("Would you like to flip a coin?(y/n)"); 
               
                answer=input.next();

              }
                      while ( answer.equals("y") );
		{
			int f = r.nextInt(2);
			String coin;

			if ( f== 1 )
                        {
				coin = "HEADS";
                                System.out.println( "You flip a coin and it is... "+coin );
                        }
			else
                        {
				coin = "TAILS";
                                System.out.println( "You flip a coin and it is... "+coin );
                        }

			

			System.out.print( "Would you like to flip again (y/n)? " );
			answer = input.next();
		}
          
                System.out.printf("Okay then,Goodbye%n");
                
        }

}
