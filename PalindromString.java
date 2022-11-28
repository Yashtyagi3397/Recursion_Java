//String Palindrom ;

import java.util.Scanner;
public class PalindromString {
    public static String reverseString(String str) {
      if(str.isEmpty())
      {
      return str;
      }
    //   System.out.println(str);
       str = reverseString(str.substring(1))+str.charAt(0);
      
       return str;
      
    }
    public static boolean checkPalindrom(String str,String newStr){
        if(str.equals(newStr))
        return true;
        else
        return false;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        // String newStr = str;
        String newStr =  (reverseString(str));
        newStr.toLowerCase();
        if(checkPalindrom(str, newStr))
            System.out.println("The String is Palindrom");
        else
            System.out.println("The String is Not Palindrom");
            sc.close();

       
    
}
}

