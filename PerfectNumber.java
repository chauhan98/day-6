import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	      System.out.print("Enter any number : ");

	      int inputNumber = scan.nextInt();


		  int sum = 0;


	      for (int i = 1; i < inputNumber ; i++)
	      {
	          if ( inputNumber % i == 0)
	          {
	            sum+=i;
	          }    
	      }
	      System.out.println("Perfect Number sum : "+sum);

	      if(sum == inputNumber) {
	    	  System.out.println(inputNumber + " is a perfect number");
	      }
	      else {
	    	  System.out.println(inputNumber + " is not a perfect number");
	      }

	}

}
