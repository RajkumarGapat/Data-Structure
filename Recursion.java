package ADS_24_May_2023;

import java.util.*;
public class Recursion {
	  public static int sumUsingRecursion(int n) {
	        if (n == 0) {                                  //base condition or terminating condition
	            return 0;
	        } else {
	            return n + sumUsingRecursion(n - 1);
	        }
	    }

	    public static void main(String[] args) {
//	        int n = 10;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter Your Number =  ");
	    	int n=sc.nextInt();
	        int sum = sumUsingRecursion(n);
	        System.out.println("Sum using recursion: " + sum);
	    }

}
