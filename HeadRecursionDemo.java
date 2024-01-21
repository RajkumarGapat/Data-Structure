package ADS_24_May_2023;

public class HeadRecursionDemo {
    public void compute(int n) {
        if(n>0) {
            compute(n-1);
            int x = n * n * n;
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        HeadRecursionDemo l = new HeadRecursionDemo();
        l.compute(10);
    }
}