package ADS_24_May_2023;

public class BinarySearchRecursion {
    public int BinarySearchRecursion(int[]A, int key, int low, int high){
        if(low > high)
        return -1;
        else{
            int mid = (low + high) / 2;
            if(key == A[mid])
            return mid;
            else if(key < A[mid])
            return BinarySearchRecursion(A, key, low, mid-1);
            else if(key > A[mid])
            return BinarySearchRecursion(A, key, mid+1, high);            
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearchRecursion s = new BinarySearchRecursion();
        int[] A = {5,7,10,15,20};
        int position = s.BinarySearchRecursion(A, 7, 0, A.length-1);
        System.out.println("Element Position : "+(position + 1));
    }
}
