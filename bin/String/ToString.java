package String;
import java.util.Scanner;

public class ToString {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter numbers : ");
        int mydata = mc.nextInt();

        String string = Integer.toString(mydata);

        System.out.println(string.length());
        mc.close();
    }
}
