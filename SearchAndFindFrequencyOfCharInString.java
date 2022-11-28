import java.util.Arrays;

public class SearchAndFindFrequencyOfCharInString {
    public static void main(String[] args) {
         String s = "Yash Tyagi";
         int visited = -1;
         int fr[] = new int[s.length()];
         for(int i=0;i<s.length();i++){
            int count =1;
            char ch = s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                    fr[j] = visited;
                
                }
                if(fr[i]==visited ){
                    fr[i] = count;
                }
            
            }
            
         }
    }
}
