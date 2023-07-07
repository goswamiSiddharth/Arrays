package arrays;
import java.util.*;
public class rotationOfArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("Enter array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter k");
        int k=sc.nextInt();
        
        rotate(arr,k);
        for(int val:arr){
            System.out.print(val + " ");
        }
    }

        public static void reverse(int arr[],int i,int j){
            int li=i;
            int ri=j;
            while(li<ri){
                int temp=arr[li];
                arr[li]=arr[ri];
                arr[ri]=temp;
                li++;
                ri--;
            }
    }

    public static void rotate(int arr[],int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }

        // part 1
        reverse(arr,0,arr.length-k-1);

        // part 2
        reverse(arr, arr.length-k,arr.length-1);

        // reverse all
        reverse(arr, 0, arr.length-1);
    }
    
}
