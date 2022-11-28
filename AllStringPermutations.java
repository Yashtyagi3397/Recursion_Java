import java.util.ArrayList;

public class AllStringPermutations {
    static ArrayList<String> permutation(String str){
        if(str.length()==0){
            ArrayList<String> a = new ArrayList<>();
            a .add(" "); 
            return a;
        }
        char s = str.charAt(0);
        String rem = str.substring(1);

        ArrayList<String> temp = permutation(rem);
        ArrayList<String> result = new ArrayList<>();
        
        for(String r : temp){
            for(int i=0 ;i<r.length();i++){
                StringBuffer sb =new StringBuffer(r);
                sb.insert(i, s);
                result.add(sb.toString());
            }

        }
        
        return result;
    }
        
        
    public static void main(String[] args) {
        String s= "abc";
        System.out.println(permutation(s)); 
        
    }
}
