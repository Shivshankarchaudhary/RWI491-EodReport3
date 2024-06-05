import java.util.Scanner;
import java.lang.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<arr.length; i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        int maxi=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            maxi=Math.max(maxi,arr[i]);
        }


        System.out.print("Largest element is -> ");
        System.out.println(maxi);
    }
}
