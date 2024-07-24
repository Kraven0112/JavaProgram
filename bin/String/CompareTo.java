package String;
import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = mc.nextLine();

        System.out.println("Enter second string : ");
        String str2 = mc.nextLine();

        if(str1.compareTo(str2) == 0){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }
        mc.close();
    }
    
}
