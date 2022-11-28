public class AdejcentChar {
    public static String concat(String str,int i){
        if(i==str.length()-1){
            return "" +str.charAt(i);
        }
        if(str.charAt(i)==str.charAt(i+1)){
            return str.charAt(i) +"*"+ concat(str, i+1);
        }
        else{
            return str.charAt(i)+concat(str, i+1);
        }
    }
    public static void main(String[] args) {
        String str = "abbabaa";
        System.out.println(concat(str, 0)); 
        
    }
}
