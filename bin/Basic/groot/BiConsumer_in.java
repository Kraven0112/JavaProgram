package Basic.groot;
import java.util.function.*;
public class BiConsumer_in {

    public static void main(String[] args)
    {
        BiConsumer<String,String> obj = (name1,name2)->{
            System.out.println(name1);
            System.out.println(name2);
        };
        obj.accept("null", "null");


        BiConsumer<String,Integer> mc = (name,age)->{
            System.out.println(name);
            System.out.println(age);
        };
        mc.accept("Sushil CHaudhart",21);
    }
}