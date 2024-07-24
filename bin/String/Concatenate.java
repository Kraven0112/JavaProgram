package String;
import java.util.Scanner;
public class Concatenate {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter firstname : ");
        String firstName = mc.nextLine();

        System.out.println("Enter lastName : ");
        String lastName = mc.nextLine();

        String fullName = firstName + " "+ lastName;

        System.out.println("My name is "+fullName);

        mc.close();
    }
}
