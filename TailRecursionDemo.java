package ADS_24_May_2023;

public class TailRecursionDemo {
    public void compute(int n) {
        if(n>0) {
            int x = n * n * n;
            System.out.println(x);
            compute(n-1);
        }
    }

    public static void main(String[] args) {
        TailRecursionDemo l = new TailRecursionDemo();
        l.compute(10);
    }
}