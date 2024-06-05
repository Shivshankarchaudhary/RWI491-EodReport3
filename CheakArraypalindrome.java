import java.util.Scanner;
public class CheakArraypalindrome {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            arr[i]=x;
        }

        int i=0; 
        int j=arr.length-1;
        
        boolean flag=false;

        while(i<=j){
            if(arr[i]!=arr[j]){
                flag=true;
            }
            i++;
            j--;
        }
       if(flag==true){
         System.out.println("Array is Not palindrome");
       }
       else{
         System.out.println("Array is palindrome");
       }
        
    }
}
