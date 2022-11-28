

//Fibonacci Series Using Recursion And Store in Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static ArrayList<Integer> fibonacci(int n,ArrayList<Integer> list){
        if(n<0){
            return list;
        }
        fibonacci(n-1, list);
        int res = isFib(n);
        list.add(res);
        return list;

        
       
    }
    public static int isFib(int n){
        if(n<=1)
        return n;
        return isFib(n-1)+isFib(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        System.out.println(fibonacci(n, list)); 
        sc.close();


    }
}
