//Julhasur chowdhury
//04/30/2018
//Lab seven rolling dice game
package lab6;
import java.util.Scanner;
import java.util.Random;
public class labSix {
	
	public static void main (String[]args) {
		int userInput;//for userInput(integer)
        String option;//for character/string choice
        String choice;//to prompt the user to roll the dice

		 Scanner scan=new Scanner(System.in);
		do {
		 
	    	System.out.println("Enter the number of sides for: ");
			 	
				 userInput=scan.nextInt();
			

	
		 
		System.out.println("hit R to roll the dice");//user must roll to play
		choice=scan.next();
		 if (choice.equalsIgnoreCase("r")){//ignores any cases on r
	
		Random r=new Random();//using random java method
		int random1=r.nextInt(userInput);//creates a random num by users numbers choice
		System.out.println("Dice 1-"+random1);
		
		int random2=r.nextInt(userInput);
		System.out.println("Dice 2-"+random2);
		
		 }
		
		else {
			System.out.println("you did not roll the dice");//if user didnt hit r
		
		}
		 System.out.println("would u like to continue(y/n) ?");
			option=scan.next();
		}
		
	while(!option.equalsIgnoreCase("n"));	
		System.out.println("thanks for playing!");
}

}

