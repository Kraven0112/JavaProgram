package Basic.groot;
import java.util.Scanner;
public class Pyramid02 {

    public static void main(String[] args){
        Scanner  mc = new Scanner(System.in);

        System.out.println("Enter range : ");
        int range = mc.nextInt();

        for(int i=1; i<=range; i++){

            for(int j=1; j<=range-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }

            System.out.println();
        }

            mc.close();
    }
}