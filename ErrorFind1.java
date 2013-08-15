import java.util.Scanner;


public class ErrorFind1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.out); //should be in 
		
		int x = 0;
		
		System.out.println("Enter a value for x: ")   //need semicolon 
		int x = in.nextDouble();		//shouldnt  be declared again //should be .nextInt 
		
		if(x>0);  //del semicolon
		{
			System.out.println("x is positive"); 
		}
		if(x<0);
		{
			System.out.println("x is negative"); 
		}
		else(x==0) //no cond 
		{
			System.out.println("x equals zero"); 
		}
		
		
		
		

	}

}
