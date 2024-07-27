package Arrays;

import java.util.Scanner;

public class GreatestElement {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = mc.nextInt();

        int[] number = new int[size];

        //element input
        for(int i=0; i<number.length; i++){
            number[i] = mc.nextInt();
        }

        int largest = number[0];
        
        //element output
        for(int i=0; i<number.length; i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        
        System.out.println("Largest element is "+largest);
        mc.close();
    }
}