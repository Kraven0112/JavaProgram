package Instance_in_java;

class Do{
    public int getInteger(){
        return 0;
    }
}

public class Instance {
    public static void main(String[] args) {
        Do obj = new Do();

        int result = obj.getInteger();

        System.out.println(result);
    }
}