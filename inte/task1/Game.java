package inte.task1;
import java.util.Scanner;
import java.util.Random;
public class Game {
	 private int maxAttempts = 5;
	    Scanner sc = new Scanner(System.in);
	    Random randon = new Random();
	    
	  public void setMaxAttempts(int a) {
	        if (a > 0) {
	            maxAttempts = a;
	        }
	    }
	   public void play(Player p) {
		   int number=randon.nextInt(100);
		   number=number+1;
		   boolean guessed=false;
		   System.out.println("" + p.getName() );
		   System.out.println(" I picked a number between 1 and 100.");
		   System.out.println("You have " + maxAttempts + " time attempts this game.");
		   
		   for (int attempt = 1; attempt <= maxAttempts; attempt++) {
	            System.out.print("Attempt " + attempt + ": ");
	            int guess = sc.nextInt();
	            
	            if (guess == number) {  
	                System.out.println("Correct! You found the number in " + attempt + " attempts.");
	                 int points = maxAttempts - attempt + 1;
	                 p.addScore(points);
	                 guessed = true;  
	                 break;  
	            }
	            else if (guess < number) {
	                System.out.println("Too low.");
	            } else {
	                System.out.println("Too high.");
	            }
	        }
		   if (!guessed) {
	            System.out.println(" correct number was: " + number);
	        }

		   p.addRound();
		   
	   }
	   
}
