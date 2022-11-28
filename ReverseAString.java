//Reverse a string


import java.util.Scanner;

public class ReverseAString {
    public static String reverseString(String str){
        if(str.isEmpty())
        return str;
        return reverseString(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str)); 
        sc.close();

        
    }
}
 