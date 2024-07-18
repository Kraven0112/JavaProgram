import java.util.Scanner;

public class Countdown {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        String value = mc.nextLine();
        int num = mc.nextInt();
        
        int totalChar = String.valueOf(value).length();

        int totalNum = String.valueOf(num).length(); 
        // int positive = String.valueOf(num>0).length();
        // int zero = String.valueOf(num<1).length();
        // int negative = String.valueOf(num<0 || num==(-num)).length();

        System.out.println("Total characters entered : "+totalChar);
        System.out.println("Total numbers entered : "+totalNum);
        // System.out.println("Total positive number : "+positive);
        // System.out.println("Total 0's :"+zero);
        // System.out.println("Total negative number : "+negative);

       mc.close();
    }
}
