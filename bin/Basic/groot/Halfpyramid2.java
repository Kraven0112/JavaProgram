package Basic.groot;
import java.util.Scanner;
public class Halfpyramid2 {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter range : ");
        int range = mc.nextInt();

        for(int i=range; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        mc.close();
    }
}