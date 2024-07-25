package String_Builder;
import java.util.Scanner;
public class DeleteChar {
    public static void main(String[]arguments){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String string = mc.nextLine();

        StringBuilder sc = new StringBuilder(string);

        sc.delete(5, 10);

;        System.out.println(sc);
        mc.close();
    }
}
