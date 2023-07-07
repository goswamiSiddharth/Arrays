package arrays;
import java.util.*;
public class reverseAnArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
            for(int val:arr){
                System.out.print(val+" ");
            }
    }
}
