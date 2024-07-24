package trycatchfinally;
public class TryCatchFinally {

    public static void main(String[]args){
        try{
            int result = 2/0;
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}