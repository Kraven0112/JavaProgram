package Bit_manipulation;
import java.util.Scanner;

public class Shiftleft {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = mc.nextInt();

        System.out.println("Enter position : ");
        int position = mc.nextInt();

        //shift left operation
        int operation = num << position;

        System.out.println("After shift left operation : "+operation);
        
        mc.close();
    }
}
