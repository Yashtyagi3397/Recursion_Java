import java.util.Scanner;

public class SearchElementInArray {
    //and filter all occurences
    public static void giveValues(int arr[],int n) {
        if(n==-1)

        return;
        Scanner sc = new Scanner(System.in);
        giveValues(arr, n-1);
        arr[n]= sc.nextInt();
        sc.close();
        
        
    }
    public static void search(int arr[],int n,int key){
        if(n==-1){
            System.out.println("Element Not found");
            return;
        }
        if(key == arr[n]){
            System.out.println("Element found at Index " +n);
            return;

        }
        search(arr, n-1, key);
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size off the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        giveValues(arr, n-1);
        System.out.println("Enter the Key Value to Search in array: ");
        int key = sc.nextInt();
        search(arr,n-1,key);
        sc.close();

        
    }
}
