package Patterns;
import java.util.Scanner;

public class Pattern02 {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        System.out.println("Enter range :");
        int range = mc.nextInt();

        //outer loop
        for(int i=1; i<=range; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        mc.close();
    }
}

// If we print i
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

//if we print j
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5