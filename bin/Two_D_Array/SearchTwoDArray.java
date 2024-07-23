package Two_D_Array;

import java.util.Scanner;

public class SearchTwoDArray {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int row = mc.nextInt();

        System.out.println("Enter column : ");
        int col = mc.nextInt();

        int[][] mynum = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mynum[i][j]= mc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(mynum[i][j]==6){
                    System.out.println(mynum[i][j] + " at "+ "row "+i+" and column "+j);
                }
            }
        }
        mc.close();
        
    }
}
