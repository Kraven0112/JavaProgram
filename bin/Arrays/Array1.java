package Arrays;

import java.util.Scanner;

public class Array1 {

    public static void main(String args[]){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = mc.nextInt();

        int array[] = new int[size];

        for(int i=0; i<array.length; i++){
            array[i]=mc.nextInt();
        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        mc.close();
    }
}