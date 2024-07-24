package String;
import java.util.Scanner;
public class CumulativeOfString {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter size of string array : ");
        int size = mc.nextInt();

        String[] name = new String[size];

        int count = 0;

        for(int i=0; i<name.length; i++){
            name[i] = mc.next();
        }

        for(int i=0; i<name.length; i++){
            count = count + name[i].length();
        }

        System.out.println("Total is : "+count);
        mc.close();
    }
}
