package Operators_and_Binary_Number;

public abstract class UnaryOperator {
    public static void main(String[]args){
        //increment operator(++)
        //post increment
        int a = 10;
        int b = a++;

        System.out.println(a); // output --> 11
        System.out.println(b); // output --> 10

        //pre-increment
        int c = 20;
        int d = ++c;

        System.out.println(d);//output --> 21
        System.out.println(c);// output --> 21


        //decrement operator(--)
        //post decrement
        int x = 30;
        int y = x--;
        System.out.println(x);//output --> 29
        System.out.println(y);// output --> 30


        //pre-decrement
        int m = 40;
        int n = --m;

        System.out.println(m);
        System.out.println(n);
    }
}
