package Bit_manipulation;

public class SetBit {
    public static void main(String[] args){
        //number
        int n =6;

        //position
        int position =1;

        //bitmask
        int bitmask = 1<<position;

        // OR operation between bitmask and number
        int operation = bitmask | n;


        System.out.println(operation);
    }
}
