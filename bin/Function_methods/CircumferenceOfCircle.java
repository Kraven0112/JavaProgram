import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void circumferenceOfCircle(float radius){
        float circumference =(float) (2*radius*3.14);
        System.out.println("Circumference of circel is "+circumference);
        return;
    }
    public static void main(String[] args){
        Scanner mc = new Scanner(System.in);
        float radius = mc.nextFloat();

        circumferenceOfCircle(radius);
        mc.close();
    }
}
