package arrays;
import java.util.*;
public class findingElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter valie of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter valie of x");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index=i;
                break;
            }
        }
        System.out.println(index);
}
    
}
