package Patterns;
import java.util.Scanner;
public class Triangle {
    public static void printrow(int n){
        if(n==0){
            return;
        }
        int i=0;
        printColumn(i,n-1);
        System.out.println();
        printrow(n-1);

    }
    public static void printColumn(int i ,int n){ 
        if(i==n){
            return;
        }
        System.out.print("*");
        
        printColumn(i++,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printrow(n);
        sc.close();
        
    }
}
