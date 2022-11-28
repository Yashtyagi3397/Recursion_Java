//Armstrong Number In array from 1 to n;



import java.util.ArrayList;  
import java.util.Scanner;

public class ArmStrong1ToNinArrayList {
    public static int checkDigits(int num){
        if(num==0){
            return 0;
        }
        num = num/10;
        int count = checkDigits(num);
        count++;
        return count;
    }
    public static int computeArmstrong(int n,int dig) {
        int a = n%10;
        if(n==0){
             
            return a;
        }
        int b = (int)(Math.pow(a, dig)) + computeArmstrong(n/10,dig); 
        return b;      
    }
    public static boolean isArmstrong(int n,int dig) {
        int num = computeArmstrong(n, dig);
        if(n==num)
        return true;
        else
        return false;
        
    }
    public static ArrayList<Integer> pushArmstrong(int n,ArrayList<Integer> list){
        if(n==0){

            return list;
        }
        int dig = checkDigits(n);
        pushArmstrong(n-1,list);
        if(isArmstrong(n,dig)){
            list.add(n);
            
        }
        return list;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = pushArmstrong(n,list);
        System.out.println(list);
        sc.close();
        
        // isArmstrong(n);
        // System.out.println("Digits are"+ isArmstrong(n,dig)); 
        
    }
}
