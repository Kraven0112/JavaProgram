package String;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String string = mc.nextLine();

        String some = string.substring(12,30);

        System.out.println(some);
        mc.close();
    }
}
