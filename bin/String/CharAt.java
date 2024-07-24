package String;
import java.util.Scanner;

public class CharAt {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String sentence = mc.nextLine();

        for(int i=0; i<sentence.length(); i++){
            System.out.print(sentence.charAt(i)+" ");
        }

        mc.close();
    }
}
