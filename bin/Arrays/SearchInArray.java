package Arrays;

import java.util.Scanner;

public class SearchInArray {
   public static void main(String[] args){
    Scanner mc = new Scanner(System.in);

    System.out.println("Enter the size of Array : ");
    int size = mc.nextInt();

    int emp[] = new int[size];

    for(int i=0; i<emp.length; i++){
        System.out.println("Enter element: ");
        emp[i]=mc.nextInt();
    }
    
    System.out.println("Enter element you want to search : ");
    int search = mc.nextInt();

    for(int i =0; i<emp.length; i++){
        if(emp[i]==search){
            System.out.println("Index no. of searched element is "+i);
        }
    }

    mc.close();
   }
}
