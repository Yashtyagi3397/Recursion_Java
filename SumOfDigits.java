import java.util.Scanner;

public class SumOfDigits {
    public static void sumOfDigits(int n,int sum){
        if(n==0){
            System.out.println(" The sum is : "+sum);
            return;

      }
      int a = n%10;
      n=n/10;
      sum = sum +a; 
      sumOfDigits(n, sum);
    
    //  System.out.println(sum);
     
      
    
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDigits(n, 0 );
        sc.close();
        // System.out.println("The sum of Digits is : "+ sumOfDigits(n, 0)); 

        
    }
    
}
