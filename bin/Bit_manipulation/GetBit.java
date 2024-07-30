package Bit_manipulation;

public class GetBit {
    public static void main(String[]args){
        //number
        int n =2;

        //position
        int position = 1;

        //bitmask
        int bitmask = 1<<position;

        //AND operation between bitmask and number
        int operation = bitmask & n;
    
        if(operation == 0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
    
}
