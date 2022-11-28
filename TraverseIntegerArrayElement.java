  //Traverse Integer array Element and format into Cube And Store and return the array List.

import java.util.ArrayList;
import java.util.Scanner;

public class TraverseIntegerArrayElement {
  
    public static void giveValues(ArrayList<Integer> list ,int n) {
        if(n==0)

        return;
        Scanner sc = new Scanner(System.in);
        giveValues(list, n-1);
        list.add(sc.nextInt());
        sc.close();
        
        
    }
     public static ArrayList<Integer> cube(ArrayList<Integer> list,int n){
        if(n==-1)
        return list;
        cube(list,n-1);
        int ele = list.get(n);
        int cu = ele*ele*ele;
        list.set(n,cu);
        return list;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        giveValues(list ,n);
        int s = list.size();
        System.out.println(cube(list, s-1));
        sc.close();

        
    }
}
