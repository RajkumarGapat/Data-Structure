package ADS_24_May_2023;
import java.util.Scanner;

public class Math_Formula {
	public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	int n;
    	System.out.println("Enten value of n : ");
    	n=sc.nextInt();
        //int n = 10;
        int sum = sumUsingFormula(n);
        System.out.println("Sum using formula: " + sum);
    }
}
