package Patterns;

import java.util.Scanner;

public class ButterFly {
    public static void printRow(int n,int c,int i) {
         if(n==0)
         return;
        //  c = (2*n)-(2*n-1);
        c = 2*i-1;
        i++;
         
         printRow(n-1,c,i);
         printCol(n);
         printSpace(c);
         printCol(n);
         

         System.out.println();
         
            
    }
    public static void printSpace(int n) {
        if(n==0)
        return;
        System.out.print(" ");
        printSpace(n-1);


        
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
        // int c = n;
        printRow(n,0,0);
        sc.close();
        
    }
}
