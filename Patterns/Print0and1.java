//Print 0 and 1;

package Patterns;

import java.util.Scanner;

public class Print0and1 {

    public static void printRow(int n) {
        if(n==0)
        return;
        
        printRow(n-1);
        
        
        printCol(n);
        
        System.out.println();
        
    }

    public static void printCol(int n) {
        if(n==0)
        return;
        if(n%2==0)
       
        System.out.print(0);
        else
        System.out.print(1);
        

        
        printCol(n-1);

       
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRow(n);
        sc.close();
    }
    
}
