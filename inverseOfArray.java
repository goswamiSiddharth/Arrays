package arrays;
import java.util.*;
public class inverseOfArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int arr2[]=inverse(arr);
        for(int val:arr2){
            System.out.print(val+" ");
        }
    }

    public static int[] inverse(int arr[]){
        int inv[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int v=arr[i];
            inv[v]=i;
        }
        return inv;

    }
}
