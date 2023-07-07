package arrays;
import java.util.*;

public class reverseArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    public static void swap(){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                start++;
                end--;
        }        
    }   
    for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
    }
}

