package Bit_manipulation;
import java.util.Scanner;;

public class Shiftright {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = mc.nextInt();

        System.out.println("Enter position : ");
        int position = mc.nextInt();

        //shiftright operation
        int operation = num >>position;

        System.out.println("After shift-right operation : "+operation);
        
        mc.close();
    }
}
