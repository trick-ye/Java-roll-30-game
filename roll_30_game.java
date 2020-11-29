///////////////////////
// Roll 30 Java Game
// By: Eli Vincelette
///////////////////////





//imports scanner utility
import java.util.Scanner;
//imports random utilty
import java.util.Random;




// roll 30 class 
public class roll_30_game {

	
	

//Main class
public static void main (String [] args ) {
	
	
	
	//asssociates scanner input to NewObj
	Scanner newObj = new Scanner(System.in);
	//sets up random class
	Random rand = new Random(); 
	
	System.out.println("Player one please enter your name: ");
	//sets playerones name from scanner input as string
	String player1 = newObj.nextLine();
	
	System.out.println("Player two please enter your name: ");
	//sets playertwos name from scanner input as string
	String player2 = newObj.nextLine();

	System.out.println("The objective of this game is to reach a score of exactly 30 and requires two players.");
	
	//sets two ints to track the players score
	int player1score = 0;
	int player2score = 0;
	
	
	
	//while loop that keeps game going until one player reaches a score of 30 
	while (player1score != 30 || player2score != 30)
	{
		System.out.println("It is " + player1 + " turn");
			 int roll1 = rand.nextInt(5);
			 roll1++;
			 int roll2 = rand.nextInt(5);
			 roll2++;
			 int roll3 = rand.nextInt(5);
			 roll3++;
			 int roll4 = rand.nextInt(5);
			 roll4++;
			 
			 System.out.println( player1 + " rolled first a " + roll1 + " then a " +roll2 );
			 System.out.println("Enter 1 to keep your first dice's roll, 2 to keep the second's roll or 3 to keep both! : ");
			 int choice = newObj.nextInt();
			 if (choice == 1)
			 {
				 player1score = player1score + roll1;
			 }
			 if (choice == 2)
			 {
				 player1score = player1score + roll2;
			 }
			 else if (choice == 3)
			 {
				 player1score = player1score + roll1 + roll2;
			 }
			 else
			 {
				 System.out.println("Please input a valid number");
			 }
			 
			 System.out.println(player1 + " your score is " + player1score);
			
				if (player1score == 30)  //if statement checking if player1 won that turn
					System.out.println( player1 + " you have won the game!");
			 
			 
			 System.out.println("It is " + player2 + "'s turn! "); //if statement checking if player2 won that turn
			 System.out.println( player2 + " rolled first a " + roll3 + " then a " +roll4 );
			 System.out.println("Enter 1 to keep your first dice's roll, 2 to keep the second's roll or 3 to keep both! : ");
			 
			 int choice2 = newObj.nextInt();
			
			 if (choice2 == 1)
			 {
				 player2score = player2score + roll3;
			 }
			 if (choice2 == 2)
			 {
				 player2score = player2score + roll4;
			 }
			 else if (choice2 == 3)
			 {
				 player2score = player2score + roll3 + roll4;
			 }
			 else
			 {
				 System.out.println("Please input a valid number");
			 }
			 
			 
			 System.out.println(player2 + " your score is " + player2score);
			 
			

				if(player2score == 30)
					System.out.println(player2 + " you have won the game!");
	}
	

}	
	
	

}
