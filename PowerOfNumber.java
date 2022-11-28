import java.util.Scanner;

public class PowerOfNumber {
    public static int  power(int n,int a){
        if(a == 1){
            return 1;
        }
        a--;
        int b = power(n, a);
        int ans = b* n;
        return ans;
         

    }
    //2^5 = 32
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n  = sc.nextInt();
        System.out.println("Enter the Power of Number: ");
        int a = sc.nextInt();
        System.out.println("The Answer is: "+power(n,a)); 
        sc.close();

        
    }
}
