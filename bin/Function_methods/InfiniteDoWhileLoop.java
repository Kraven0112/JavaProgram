import java.util.Scanner;

public class InfiniteDoWhileLoop {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int num = mc.nextInt();

        do{
            System.out.println("I am from Nepal.");
            num++;
        }while(num>0);
        mc.close();
    }
}
