//Chad Sanders 
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chad_Sanders_Week7Assignment {

	public static void main(String[] args) 
	
	
	
	{ // main method
		
		// variables and instantiation
		Scanner userInput = new Scanner(System.in);	
		Random generator = new Random();
		int teams;
		int games;
		int min = 1;
		int max = 100;
		int sum = 0;
		int rowTotal = 0;
		int topTeam = 0;
		
		System.out.println("-----------------------------------------------------------------");	
		System.out.println("Football Team Randomized Season Scores");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("Enter the number of teams: ");
	
		teams = userInput.nextInt();
	
		System.out.print("Enter the number of: ");
	
		games = userInput.nextInt();
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println();
				
		// Setting up a 2 dimensional array
		int [][] x = new int [teams][games];
		
		
		for (int i = 0; i < teams; i++ )
		{    //start outer loop                              
			for (int j = 0; j < games; j++)
			{                                
			x[i][j] = generator.nextInt((max - min) + 1) + min; 
			}                                 
		}// end outer loop     

		System.out.print("");  //line down----------------------------------------------------------------------
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Football Scores Report");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Team" + "\t" + "Scores" + "\t"+ "\t" + "\t" + "\t" +  "Tot" + "\t" + "Avg");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(""); // line down------------------------------------------------------------

		System.out.println();
		for (int i = 0; i < teams; i++ )
			
		{ // outer loop start (rows)
			System.out.print("Team  " + (i + 1) + ":" + "   " ); // print word "row" + number on every row
			for (int j = 0; j < games; j++)
				{ //inner loop start
				System.out.print(x[i][j] + " ");
				rowTotal = rowTotal + x[i][j];
				
				if (x[i][j] > topTeam) 
	                topTeam = x[i][j]; 
				
			
				} // inner loop end
			
			System.out.print("\t"  + rowTotal + "\t" + rowTotal/games ); // tab over and give line total
			System.out.println();
			
			 
			
       
			 
		} // outer loop end
			
	
		
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Top Team" + ":" + topTeam ); // edit
		System.out.println("-----------------------------------------------------------------");

		
	
		
	} // end main method
	
} // class end

	

