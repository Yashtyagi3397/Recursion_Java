public class PowerOftwo {
    static boolean check(int a){
        if(a == 1){
            return true;
          }
       if(a % 2 !=0){
        return false;

      }  
         return check(a/2);
    }
    public static void main(String[] args) {
        int a =18;
        System.out.println(check(a));
        
    }
}
