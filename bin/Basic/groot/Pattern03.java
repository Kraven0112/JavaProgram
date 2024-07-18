package Basic.groot;
import java.util.Scanner;
public class Pattern03 {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.print("Enter range :");
        int range = mc.nextInt();

        //outer loop
        for(int i=1; i<=range; i++){
            //loop for space 
            for(int j=1; j<=range-i; j++){
                System.out.print(" ");
            }

            //loop for star print
            for(int j=1; j<=i; j++){
                System.out.print("*");           
            }
            System.out.println();
        }
        mc.close();
    }
}