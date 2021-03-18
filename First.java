package first;
import java.util.*;


public class First {

	public static void main(String[] args) {
	     int principal ,rateOfinterest,time;
	    double amount,interest;
		System.out.println("enter principal, rate of interest and time");
		Scanner sc = new Scanner(System.in);
		principal=sc.nextInt();
		rateOfinterest=sc.nextInt();
		 time=sc.nextInt();
		int i=1;
		while(i<=time)
		{
			float base=1+(rateOfinterest/100);
		 	int exponent=i;
			amount=principal*(Math.pow(base,exponent));
			interest=amount-principal;
		    System.out.println( "amount  is " +amount);
		    System.out.println("interest is "+ interest);
	        i++;
		}
	
	}

}
