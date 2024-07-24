package String;
import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter numbers : ");
        String numbers = mc.nextLine();

        int mynum = Integer.parseInt(numbers);

        System.out.println(mynum);

        mc.close();
    }
}
