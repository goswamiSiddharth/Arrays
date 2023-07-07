package arrays;
import java.util.*;
public class ceilAndFloor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("Enter array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int ceil=0;
        int floor=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(k<arr[mid]){
                high=mid-1;
                ceil=arr[mid];
            }else if(k>arr[mid]){
                low=mid+1;
                floor=arr[mid];
            }else{
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
        }
        System.out.println(ceil+"\t"+floor);
    }
}
