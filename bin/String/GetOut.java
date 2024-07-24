package String;

import java.util.Scanner;

public class GetOut {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = mc.nextLine();

        String result = "";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                result = result+email.charAt(i);
            }
        }
        System.out.println(result);
        mc.close();
    }
}
