import java.util.HashMap;

public class FindFrequencyOfEachChar {
    static HashMap<Character,Integer> getFr(String str,int len,int index){
        if(index == len){
            HashMap<Character,Integer> map =new HashMap<>();
            return map;
        }
       
        HashMap<Character,Integer> map =  getFr(str, len, index+1);
        char SingleChar = str.charAt(index);
        if(map.get(SingleChar)==null){
            map.put(SingleChar, 1);
        }
        else{
            int count = map.get(SingleChar);
            map.put(SingleChar, count+1);
        }
        return map;

    }

    public static void main(String[] args) {
        String str = "Yash Tyagi";
        int n = str.length();
        System.out.println(getFr(str,n,0));        
        

    }
}