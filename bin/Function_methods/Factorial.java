import java.util.Scanner;

public class Factorial {
    public static void factorial(int range){
        if(range<0){
            System.out.println("Invalid number.");
            return;
        }


        int fact = 1;
        for(int i=range;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int range = mc.nextInt();
        mc.close();
        factorial(range);
}
}
