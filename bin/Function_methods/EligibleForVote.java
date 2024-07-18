import java.util.Scanner;

public class EligibleForVote {
    public static void eligibleForVote(int age){
        if(age<18){
            System.out.println("Not eligible for voting.");
            return;
        }
        else{
            System.out.println("Eligible for voting.");
            return;
        }
    }
    public static void main(String[]args){
        Scanner mc = new Scanner(System.in);
        int age = mc.nextInt();
        eligibleForVote(age);
        mc.close();
    }
}
