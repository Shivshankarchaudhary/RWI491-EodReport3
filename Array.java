/**
 * Array
 */
import java.util.Scanner; 
public class Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
     int[] arr =new int[n];
     
     for(int i=0; i<arr.length; i++){
        int x=sc.nextInt();
         arr[i]=x;
     }
     
     for(int i=0; i<arr.length; i++){
       System.out.println(arr[i]);
     }

  }
    
}