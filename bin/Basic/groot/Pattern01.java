package Basic.groot;
import java.util.Scanner;
public class Pattern01 {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println(("Enter range of row: "));
        int row = mc.nextInt();

        System.out.println("Enter range of column : ");
        int col = mc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1|| i==row || j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        mc.close();
    }
}