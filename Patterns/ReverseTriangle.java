package Patterns;

import java.util.Scanner;

public class ReverseTriangle {
    private static void printRow(int n) {
        if(n==0)
        return;
        printRow(n-1);
        printCol(n);
        System.out.println();

        
    }
    public static void printCol(int n) {
        if(n==0)
        return;
        System.out.print("*");
        printCol(n-1);  
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRow(n);
        sc.close();
        
    }
    
}
