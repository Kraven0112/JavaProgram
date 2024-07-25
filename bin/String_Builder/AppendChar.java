package String_Builder;
import java.util.Scanner;
public class AppendChar {
    public static void main(String[]arguments){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String string = mc.nextLine();

        StringBuilder sc = new StringBuilder(string);

        sc.append("ello");
        sc.append(" I ");
        sc.append("My name is ");
        sc.append(" Sushil Chaudhary ");

        System.out.println(sc);
        
        mc.close();
    }
}
