package Basic.groot;
import java.util.function.*;
import java.util.Scanner;
public class Predicate_in {

    public static void main(String[] args)
    {
        Scanner mc = new Scanner(System.in);
        int a = mc.nextInt();
        int b = mc.nextInt();
        int c = mc.nextInt();
        int d = mc.nextInt();

        Predicate<Integer> obj  = num -> num%2==0;

        System.err.println(obj.test(a));
        System.err.println(obj.test(b));
        System.err.println(obj.test(c));
        System.err.println(obj.test(d));

        mc.close();
    }
}