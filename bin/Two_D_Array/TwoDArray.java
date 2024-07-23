package Two_D_Array;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
         
        System.out.println("Enter row : ");
        int row = mc.nextInt();

        System.out.println("Enter column : ");
        int col = mc.nextInt();

        int[][] num = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                num[i][j] = mc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
               System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        mc.close();
    }
}