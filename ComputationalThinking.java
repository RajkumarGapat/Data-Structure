package ADS_24_May_2023;

public class ComputationalThinking {
	 public static int sumUsingComputationalThinking(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        int sum = sumUsingComputationalThinking(n);
	        System.out.println("Sum using computational thinking: " + sum);
	    }
}
