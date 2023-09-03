package com.simplegame;
import java.util.Scanner;

public class Randomnumberguess {
	static int tries=0;
	public static void main(String[] args) {
		//Function Call
 guessingNumberGame();
}
	//Function that implements the number guessing game
	private static void guessingNumberGame() {
		
		//Scanner Class
		Scanner sc=new Scanner(System.in);
		System.out.println("Number guessing game");
		System.out.print("What is your name:");
		String username=sc.nextLine();
		System.out.println("Well"+" "+username+" "+",I am thinking of a number between 1 to 100!");
		
		//Generate the numbers
		int num=1+(int)(100*Math.random());
		
		//Given k trials
		int k=10;
		int i,guess;
		
		System.out.println("A number is chosen between 1 to 100(You have 10 trials):");
		
		//Iterate over K trials
		for ( i = 0; i <k; i++) {
		
			System.out.println("Guess the number :");
			
			//Take input for guessing
			guess=sc.nextInt();
			
			//If the number is guessed
			if (num==guess) {
				tries++;
				//you guessed correctly
			System.out.println("Congratulations! You guessed the number.");
			System.out.println("You are won the game!");
			System.out.println("number of tries required to guessed number was"+" "+tries);
			System.out.println("your game score was"+" "+tries+" "+"out of 10.");
			
			break;
			} else if(num>guess && i!=k-1){
				//your guess is to high!
				tries++;
				System.out.println("The num is greater than"+" "+guess);	
			}
			else if(num<guess && i!=k-1){
				//your guess is to low!
				tries++;
				System.out.println("The num is less than"+" "+guess);	
			}
		}
		
		 	if(i==k) {
			
			//if the user guess the answer wrong too many times
			System.out.println("You have exhausted k trials.");
			System.out.println("sorry! You are not correct guessed the number.You are lost the game! Better luck next time! please try again.");
			System.out.println("The number was"+" "+num);
		}
	}
	
}
