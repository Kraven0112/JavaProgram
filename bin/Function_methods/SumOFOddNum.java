import java.util.Scanner;

public class SumOFOddNum {
    public static void sumOfOdd(int num){
        if(num<0){
            System.out.println("Invalid num");
            return;
        }
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(i % 2 !=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd numbers : "+sum);
        return;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        int range = mc.nextInt();

        sumOfOdd(range);
        mc.close();
    }
}
