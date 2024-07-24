package String;
import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter any String having letter e : ");
        String mysen = mc.nextLine();

        String result = "";

        for(int i=0; i<mysen.length(); i++){
            if(mysen.charAt(i) == 'e'){
                result = result +"i";
            }
            else{
                result = result+mysen.charAt(i);
            }
        }
        System.out.println(result);

        mc.close();
    }
}
