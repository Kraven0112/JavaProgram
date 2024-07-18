import java.util.Scanner;

public class Power {
    public static void power(int num,int power){
        int total = (int) Math.pow(num, power);
        System.out.println(total);
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int x = mc.nextInt();
        int n = mc.nextInt();

        power(x, n);
        
        mc.close();
    }
}
