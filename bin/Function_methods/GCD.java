import java.util.Scanner;

public class GCD {
    public static void gcd(int num1,int num2){
        int divisor = 0;
        for(int i=1; i<=num2 || i<=num1; i++){
            if(num1%i==0 && num2%i==0){
              if(divisor<=i){
                divisor = i;
              }
            }
        }
        System.out.println("Greatest Common Divisor of "+num1+" and "+num2+" is "+divisor);
        return;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=mc.nextInt();

        System.out.println("Enter second number : ");
        int num2=mc.nextInt();

        gcd(num1, num2);


        mc.close();
    }
}
