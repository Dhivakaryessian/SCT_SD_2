import java.util.Random;
import java.util.Scanner;

public class Guessing_Random_number {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		int randomnum=random.nextInt(100)+1;
		
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println();

		
		

		
		
		
		int attempt=0;
		int guess;
		
		do {
		System.out.println("Enter the number between 1 to 100 :");

		guess=sc.nextInt();
			
			attempt++;
			
			if(guess<randomnum) {
				System.out.println("it is lesser than system guessed number  " );

			}
			else if(guess>randomnum) {
				System.out.println("it is greater than system guessed number  " );

				
			}
			else { 
				System.out.println("Congrats you guess the Number  with a " +attempt+ " no.of attempts");

				  
			}
			
			
			
			
		}while(guess !=randomnum);

		
		/*
		 * do{
		 
			System.out.println("Guess a number between 1 and 100 :");
			guess =sc.nextInt();
			attempt++;



		
			if(guess<=randomnum) {
				
				System.out.println("it is lesser than system guessed number  : "    + randomnum);
				
			}
			else if(guess>=randomnum) {
				 
				System.out.println("it is greater than system guessed number :" + randomnum);
				
			}
			
			
			else {
				System.out.println("you guessed right  .....you won");
	
			}

		}while(guess != randomnum);
			

		   
	*/
		

	}
	
	}
