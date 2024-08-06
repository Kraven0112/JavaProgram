package TypeOfFunctionMethod;

public class BooleanMethod {
    public static boolean greatecheck(int a,int b){
        return a > b;
    }
    public static boolean smallercheck(int a,int b){
        return a < b;
    }
    public static boolean evenNum(int num){
        return num % 2 == 0;
    }
    public static boolean oddNum(int num){
        return num % 2 == 1;
    }
    public static void main(String[]args){
        System.out.println(greatecheck(123, 120));
        System.out.println(smallercheck(12,14));
        System.out.println(evenNum(5));
        System.out.println(oddNum(4));
    }
}
