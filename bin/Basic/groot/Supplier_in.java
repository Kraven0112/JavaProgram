package Basic.groot;
import java.util.function.Supplier;
public class Supplier_in{
    public static void main(String[] args)
    {
     Supplier <String> oops = ()->"groot in junglebook";
     Supplier <Integer> oops1 = ()->12;

    System.err.println(oops1.get());
     System.out.println(oops.get());
    }
}