import java.util.Scanner;

public class FunctionFibbo {
    public static void fbonacci(int range){
        int a=0;
        int b=1;
        int c;
        for(int i=1; i<=range; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        return;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter range of number :");
        int range = mc.nextInt();

        fbonacci(range);
        mc.close();
    }
}
