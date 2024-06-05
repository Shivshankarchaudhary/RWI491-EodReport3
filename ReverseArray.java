import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

       int[] newArr=new int[n];
       
       int j=0;
       for(int i=n-1; i>=0; i--){
         newArr[j]=arr[i];
         j++;
       }

       for(int i=0; i<n; i++){
        System.out.print(newArr[i]+ " ");
       }
       
    }
}
