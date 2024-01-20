package ADS_24_May_2023;

public class TreeRecursionDemo {
    public void compute(int n) {
        if(n>0) {
            compute(n-1);
            int x = n * n;
            System.out.println(x);
            compute(n-1);
        }
    }

    public static void main(String[] args) {
        TreeRecursionDemo l = new TreeRecursionDemo();
        l.compute(3);
    }
}