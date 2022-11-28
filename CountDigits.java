public class CountDigits {
    static int count(int num){
        if(num==0){
            return 0;
        }
        num = num/10;
        int count = count(num);
        count++;
        return count;

    }
    public static void main(String[] args) { 
        int num = 1235;
        
        int ans = count(num);
        System.out.println("The count is : "+ ans);


        
    }
}
