import java.util.Scanner;

public class PrimenumberArray {
    public static boolean isPrime(int n,int i){
        if(i==n-1){
            // System.out.println("The Number is prime");
            return true;
        }
        

      if(n%i==0){
        // System.out.println("The Number is Not Prime ");
        return false;
      }
      i++;
      return isPrime(n, i);
    }
    public static void addPrime(int n,int i){
        if(n==2){
            return;
            
        }
        boolean res = isPrime(n-1, i);
        if(res == true){
            System.out.println("The Number is "+ i);

        }
        
        addPrime(n-1, i);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[]= new int[n];
        addPrime(n,2);
        sc.close();

        
    }
}
