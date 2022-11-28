import java.util.Scanner;

public class DigitPrint {

    public static void printdigit(int n){
        if(n==0){
            return;
        }
       int a = n%10;
       n = n/10;
       
       printdigit(n);
       
       
       System.out.println(a);
       


        
        

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdigit(n);
        sc.close();


    }

}
