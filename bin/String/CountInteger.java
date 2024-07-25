package String;
import java.util.Scanner;
public class CountInteger {
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int mynum = mc.nextInt();

        String ourNum = Integer.toString(mynum);
        int zero = 0;
        int one = 0;

        for(int i=0; i<ourNum.length(); i++){
            if(ourNum.charAt(i) == '0'){
                zero++;
            }
            else if(ourNum.charAt(i) == '1'){
                one++;
            }
        }
        System.out.println("Total zero = "+zero);
        System.out.println("Total one = "+one);
        mc.close();
    }
}
