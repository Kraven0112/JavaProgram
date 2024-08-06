package TypeOfFunctionMethod;

public class Method {
    //static sum method
    public static int sum(int a,int b){
        return a+b;
    }
    //static getString method
    public static String getString(String str1,String str2){
        return str1.concat(str2);
    }
    //static boolean check method
    public static boolean check(int num){
        return num > num/2;
    }
    //static void method
    public static void stringLength(String string){
        System.out.println(string.length());
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static int reminder(int a,int b){
        return a%b;
    }

    public static void main(String[]args){
        System.out.println(sum(120, 120));
        System.out.println(getString("Sushil","Chaudhary"));
        System.out.println(check(224));
        stringLength("My name is Sushil Chaudhary. I am from Nepal. I want to be a software developer. I know it will take times to be a software developer.");
        System.out.println(multiplication(12, 12));
        System.out.println(division(112, 2));
        System.out.println(reminder(20, 3));

    }
}
