package String;
import java.util.Scanner;
public class Counting {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = mc.nextLine();

        int countA = 0;
        int countS = 0;

        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)=='a'){
                countA++;
            }
            else if(sentence.charAt(i)=='s' || sentence.charAt(i)=='S'){
                countS++;
            }
        }
        System.out.println("Total no. of a letter is "+ countA);
        System.out.println("Total no. of s letter is "+countS);
        mc.close();
    }
}