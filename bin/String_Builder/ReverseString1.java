package String_Builder;
import java.util.Scanner;
public class ReverseString1 {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String string = mc.nextLine();

        StringBuilder sc = new StringBuilder(string);

        for(int i=0; i<sc.length()/2; i++){
            int frontIndex = i;
            int backIndex = sc.length()-1-i;

            char frontChar = sc.charAt(frontIndex);
            char backChar = sc.charAt(backIndex);

            sc.setCharAt(frontIndex, backChar);
            sc.setCharAt(backIndex, frontChar);
        }

        System.out.println(sc);

        mc.close();
    }
}
