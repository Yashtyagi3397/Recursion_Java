package Patterns;

public class Substring {
    public static String Rev(String str) {
        if(str.isEmpty())
        return str;
        String newS = Rev(str.substring(0))+str.charAt(0);
        System.out.println(newS);
        return newS;
        
    }
    public static void main(String[] args) {
        String S = "Yash";
        String newS = Rev(S);
        System.out.println(newS);
        
        
    }
}
