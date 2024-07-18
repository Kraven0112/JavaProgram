package Basic.groot;
import java.util.function.*;

public class Consumer_in_java{
    public static void main(String[] args)
    {
        Consumer <Integer> mc = (gift) ->{
            System.out.println("The gift number is : "+gift);
        };
        mc.accept(12);
    }
}
