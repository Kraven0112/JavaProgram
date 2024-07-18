package Basic.groot;
import java.util.Scanner;

public class Pattern04 {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter range : ");
        int range = mc.nextInt();

        //loop for row
        for(int i=1; i<=range; i++){
            //loop for column
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        mc.close();
    }
}


//If we print(j)
// 1
// 12
// 123
// 1234
// 12345

//If we print(i)
// 1
// 22
// 333
// 4444
// 55555