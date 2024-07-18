package Basic.groot;
import java.util.Scanner;

public class Pattern05 {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter range : ");
        int range = mc.nextInt();

        //outer loop
        for(int i=range; i>=1; i--){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        mc.close();
    }
}