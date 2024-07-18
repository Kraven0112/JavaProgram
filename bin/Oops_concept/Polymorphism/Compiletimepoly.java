package Oops_concept.Polymorphism;

class Human{
    public int done(int num)
    {
        return num;
    }
    public void done(){
        System.out.println("Hello I am doing from void method.");
    }
    public String done(String munna){
        return munna;
    }
}
public class Compiletimepoly {
    public static void main(String[] args){
        Human obj = new Human();

        obj.done();//from void method
        System.out.println(obj.done("Sushil CHauhdary"));//from String method
        System.out.println(obj.done(21));//from int method
    }
}
