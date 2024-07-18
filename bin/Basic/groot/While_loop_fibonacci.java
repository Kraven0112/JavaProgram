package Basic.groot;
import java.util.Scanner;
public class While_loop_fibonacci {

    public static void main(String[] args)
    {
        Scanner mc = new Scanner(System.in);
        int range = mc.nextInt();

        int a = 0;
        int b = 1;
        int  i =1;
        //While loop will get repeatedly print all possible value of variable a.    


        while(i<=range)
        {
            System.out.println(a + " ");
            int c = a+b ;
            a=b;
            b=c;
        }

        mc.close();
    }
}