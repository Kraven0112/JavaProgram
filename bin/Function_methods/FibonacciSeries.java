import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter range of fibonacci series: ");
        int range = mc.nextInt();

        int a=0;
        int b=1;
        int c;
        for(int i=1; i<=range;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        mc.close();
    }
}

