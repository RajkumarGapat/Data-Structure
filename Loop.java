package ADS_24_May_2023;

public class Loop {
    public static int sumUsingLoops(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; //sum=sum+i
        }
        return sum;
    }

    public static void main(String[] args) {
        //int n = 10;
        int sum = sumUsingLoops(10);
        System.out.println("Sum using loops: " + sum);
    }
}