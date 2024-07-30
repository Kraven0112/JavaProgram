package Bit_manipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter operation for 0 or 1 : ");
        int operation = mc.nextInt();

        //in update bit operation for-1 means set operation and for-0 means clear operation

        //number
        int num = 5;

        //position
        int position =2;

        //bitmask
        int bitmask = 1<<position;


        //notOfbitmask
        int notofbitmask = ~(bitmask);

        if(operation == 1){
            int result = num | bitmask;
            System.out.println(result);
        }else{
            int result = num & notofbitmask;
            System.out.println(result);
        }
        
        mc.close();
    }
    
}
