
//Check Array is Sorted or not;

import java.util.Scanner;

public class CheckArrayIsSortedOrNot {
    // Given an Array of Integers
    public static void giveValues(int arr[],int n) {
        if(n==0)

        return;
        Scanner sc = new Scanner(System.in);
        giveValues(arr, n-1);
        arr[n]= sc.nextInt();
        sc.close();
        
        
    }
    public static boolean checkArraySorted(int arr[],int n) {
        if(n==0){
            return true;
        }
        
        if(arr[n]<arr[n-1]){
            return false;
        }
        return checkArraySorted(arr, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        giveValues(arr, n-1);
        boolean res = checkArraySorted(arr,n-1);
        if(res==true)
        System.out.println("Array is Sorted ");
        else
        System.out.println("Array is not Sorted");
        sc.close();
        
        
    }
}
