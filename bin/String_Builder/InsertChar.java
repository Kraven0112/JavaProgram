package String_Builder;
import java.util.Scanner;
public class InsertChar {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String string = mc.nextLine();

        StringBuilder sc = new StringBuilder(string);

        sc.insert(10, 'b');
        sc.insert(1, 'd');
        sc.insert(5, 'r');
        sc.insert(4, 'f');

        System.out.println(sc);
        mc.close();
    }
}
