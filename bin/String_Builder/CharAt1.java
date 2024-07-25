package String_Builder;
import java.util.Scanner;
public class CharAt1 {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String string = mc.nextLine();

        String result = "";
        StringBuilder sc = new StringBuilder(string);

        for(int i=0; i<sc.length(); i++){
            if(sc.charAt(i) == 'd'){
                result = result +"e";
            }
            else{
                result = result + sc.charAt(i);
            }
        }

        System.out.println(result);
        
        mc.close();

    }
}
