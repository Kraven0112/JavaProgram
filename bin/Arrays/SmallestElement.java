package Arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = mc.nextInt();

        int[] number = new int[size];

        for(int i=0; i<number.length; i++){
            number[i] = mc.nextInt();
        }

        int smallest  = number[0];

        for(int i=0; i<number.length; i++){
            if(number[i]<smallest){
                smallest = number[i];
            }
        }

        System.out.println("Smallest element is "+smallest);
        
        mc.close();
    }
}
