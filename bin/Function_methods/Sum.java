import java.util.Scanner;

public class Sum {
    public static int result(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);

        int a=mc.nextInt();
        int b = mc.nextInt();

        int sum  = result(a, b);
        
       System.out.println("Sum is "+sum);

        mc.close();
    }
}
