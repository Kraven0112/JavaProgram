import java.util.Scanner;

public class GreaterOfTwo {
    public static int greaterNum(int num1,int num2){
        if(num1>num2){
            System.out.println(num1+" greater than "+num2);
            return num1;
        }
        else{
            System.out.println(num2+" greater than "+num1);
            return num2;
        }
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int num1 = mc.nextInt();
        int num2 = mc.nextInt();

        greaterNum(num1, num2);

        mc.close();
    }
}
