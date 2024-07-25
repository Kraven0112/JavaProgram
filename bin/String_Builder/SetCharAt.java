package String_Builder;
import java.util.Scanner;
public class SetCharAt {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String string = mc.nextLine();

        StringBuilder sc = new StringBuilder(string);

        for(int i=0; i<sc.length(); i++){
            if(i%2==0){
                sc.setCharAt(i,'a');
            }
        }

        System.out.println(sc);
        mc.close();
    }
}
