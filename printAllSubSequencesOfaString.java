import java.util.ArrayList;

public class printAllSubSequencesOfaString {
    static ArrayList<String> getSeq(String str){
       
       
         if(str.length()== 0 ){
            ArrayList<String> empArrayList = new ArrayList<>();
            empArrayList.add(" ");
            return empArrayList;
         }
         char current = str.charAt(0);
         String rem = str.substring(1);

        ArrayList<String> temp =  getSeq(rem);
        ArrayList<String> result = new ArrayList<>();
        for(String s: temp){
            result.add(s);
            result.add(current+s);
        }
        return result;
        
            
         }
         
         
        
    
    public static void main(String[] args) {
        String str = "Yash";
        // int n= str.length();
       
       System.out.println(getSeq(str)); 
    
         

    }
}
