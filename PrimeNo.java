import java.util.Scanner;

public class PrimeNo {
    public static void prime(int n,int i){
        if(i==n-1){
            System.out.println("The Number is prime");
            return ;
        }
        

      if(n%i==0){
        System.out.println("The Number is Not Prime ");
        return ;
      }
      i++;
      prime(n, i);
    
       

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        prime(n, 2);
        sc.close();
        // int ans = prime(n,2);
        // if(ans == 1){
        //     System.out.println("The Number is Prime");
        // }
        // else{
        //     System.out.println("The Number is Not prime");
        // }
        
    }
    
}
