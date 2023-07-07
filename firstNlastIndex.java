package arrays;
import java.util.*;
public class firstNlastIndex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter data");
        int k=sc.nextInt();

        int low=0;
        int high=arr.length-1;
        int lastIndex=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(k<arr[mid]){
                high=mid-1;
            }else if(k>arr[mid]){
                low=mid+1;
            }else{
                lastIndex=mid;
                low=mid+1;
            }
        }
        System.out.println(lastIndex);

        low=0;
        high=arr.length-1;
        int firstIndex=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(k<arr[mid]){
                high=mid-1;
            }else if(k>arr[mid]){
                low=mid+1;
            }else{
                firstIndex=mid;
                high=mid-1;
            }
        }
        System.out.println(firstIndex);
    }
}
