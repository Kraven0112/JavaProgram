package Arrays;

import java.util.Scanner;

public class Maximum {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = mc.nextInt();

        int numbers[] = new int[size];

        int max = 0;
        int min = 0;

        for(int i=0; i<numbers.length; i++){
            numbers[i] = mc.nextInt();
        }

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Largest number : "+max);
        mc.close();
    }
}