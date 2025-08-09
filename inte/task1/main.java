package inte.task1;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);  

	    Player p = new Player(); 
	    Game g = new Game();      

	    System.out.println("Welcome to the Number Guessing Game");

	    
	    System.out.print("Enter your name: ");
	    String name = sc.nextLine(); 
	    p.setName(name);             

	  
	    System.out.print("Enter number of maximum attempts: ");
	    int attempts = sc.nextInt();     
	    g.setMaxAttempts(attempts);     

	    int again = 1;
	    while (again == 1) {
	        g.play(p);  

	        
	        System.out.print("Do you want to play again? (1 = Yes, 0 = No): ");
	        again = sc.nextInt();
	    }

	    
	    p.showResult();
	    System.out.println(" Thanks for playing!");
	}

}
