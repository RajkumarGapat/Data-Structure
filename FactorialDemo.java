package ADS_24_May_2023;

public class FactorialDemo {
    public int factorialIterative(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    /*Factorial of a number
    5! => 5 X 4 X 3 X 2 X 1
    0! => 1 */
    public int factorialRecursive(int n) {
        if(n==0)
            return 1;
        return factorialRecursive(n-1) * n;
    }

    public static void main(String[] args) {
        FactorialDemo l = new FactorialDemo();
        System.out.println("Factorial: " + l.factorialIterative(5));
        System.out.println("Factorial: " + l.factorialRecursive(5));
    }

}