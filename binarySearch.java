package arrays;
import java.util.*;
public class binarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("enter no. to be searched ");
        int k=sc.nextInt();

        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(k<arr[m]){
                h=m-1;
            }else if(k>arr[m]){
                l=m+1;
            }else{
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
    
}
