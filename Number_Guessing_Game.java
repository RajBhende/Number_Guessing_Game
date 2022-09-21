// Java program for implementation of Number guessing game
package myproject1;


import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
	
	public static void main (String[]args) {
	
	Random dice = new Random();

	int upperbound = dice.nextInt(100) + 1; // logic to generate random letter
	System.out.println("random no is: "+ upperbound);
	
	int count = 0;
	
	//Scanner Class
	Scanner scanner = new Scanner (System.in);
	
	while (count <3){ // loop till three attempts
	
	{
		count++; 
		System.out.println(count +". Enter your guess (1-100): "); //enter integer
	    int playerGuessNo = scanner.nextInt();
	
		if (playerGuessNo == upperbound) {
		System.out.println("you guess is correct ! you win!\n ");
		break;}
	
		if(playerGuessNo>upperbound) { //compare integer directly
		
		System.out.println("The number you enter is higher, Try again:\n ");}
	
		if (playerGuessNo<upperbound){// compare integer directly
		System.out.println("The number you enter is lower, Try again:\n ");
		
	
		if (count==3){ // for maximum number reach
			System.out.println (" :max number of attempts reached. please restart a Game!");
	}
	
	
	 
	
}
	      }
	}
	
	}    
	
}




