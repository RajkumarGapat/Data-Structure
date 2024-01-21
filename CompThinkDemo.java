package ADS_24_May_2023;

public class CompThinkDemo {

    public int sumMath(int n) {

                    return n * (n+1) / 2;
    }
public int sumCompThink(int low,int high) {

    return (low+high) * high / 2;
}
    public int sumIteration (int n) {
        int total = 0;
        int i = 1;
        while(i<=n) {
            total = total + i;
            i = i + 1;
        }
        return total;
    }
public int sumRecursion (int n) {
        if(n==0)
            return 0;
        return sumRecursion (n-1) + n;
    }

public static void main(String[] args) {
    CompThinkDemo s = new CompThinkDemo();
    System.out.println("Using Math Formula Sum : " + s.sumMath(200));
    System.out.println("Using Iteration Sum : " + s.sumIteration(200));
    System.out.println("Using Recursion Sum : " + s.sumRecursion(200));
    System.out.println("Using Computational Thinking Sum : " + s.sumCompThink(1,200));
}

}
