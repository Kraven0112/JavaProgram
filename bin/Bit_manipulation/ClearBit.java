package Bit_manipulation;

public class ClearBit {
    public static void main(String[] args){
        //number
        int n = 5;

        //position
        int position = 2;

        //bitmask
        int bitmask = 1<<position;

        //not of bitmask
        int notOfBitmask = ~(bitmask);

        //AND operation between number and not of bitmask
        int operation = notOfBitmask & n ;
        System.out.println(operation);
    }
}
