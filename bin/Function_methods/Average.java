import java.util.Scanner;

public class Average {

    public static int average(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int a = mc.nextInt();
        int b = mc.nextInt();
        int c = mc.nextInt();

        System.out.println("Average of three numbers: "+average(a, b, c));
        mc.close();
    }
}