package New_Folder;
import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int userint = mc.nextInt();

        String strnum = Integer.toString(userint);
        int zero= 0;
        int one = 0;

        for(int i=0; i<strnum.length(); i++){
            if(strnum.charAt(i) == '0'){
                zero++;
            }
            else if(strnum.charAt(i)=='1'){
                one++;
            }
            
        }
        System.out.println("No. of zero is "+zero);
        System.out.println("No. of one is "+one);
        mc.close();
    }
    
}