public class PrintNumRecursive{

    static void printNumbers(int num){
        //Small Problem is (num-1)

       
        if(num==0){
            return;
        }
        printNumbers(num-1);
        System.out.println(num);
        

    }
    public static void main(String[] args) {
        printNumbers(5);
        
    }
}  