import java.util.Scanner;

public class Product {
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int a = mc.nextInt();
        int b = mc.nextInt();


        System.out.println("Product is "+multiply(a, b));
        mc.close();
    }
}
