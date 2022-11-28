import java.util.Scanner;


public class SumOfEvenPlaceAndOddPlace {
    public static void sumOfEvenPlaceAndOddPlace(int n,int i,int sumE,int sumO){
        int a = n%10;
        n = n/10;
        if(n==0){
            sumO = sumO+a;
            System.out.println("The Odd sum is: "+sumO);
            System.out.println("The Even Sum is : "+sumE);
            return;
        }

        if(i%2==0){
            sumO = sumO +  a;

        }
        else{
            sumE = sumE+a;
        }
       
        i++;
        sumOfEvenPlaceAndOddPlace(n, i, sumE,sumO);

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        sumOfEvenPlaceAndOddPlace(n, 0, 0,0);
        sc.close();
        
    }
    
}
