package Oops_concept.Encapsulation;

public class Encapsule {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.name="Horse";
        horse.eyes =2;
        horse.setLeg(4);
        horse.getLeg();
        String typeOfHorse = Horse.type="Hervivores";
        System.out.println("Type of animal is : "+typeOfHorse);

        Dog dog = new Dog();
        dog.name="Dog";
        dog.eyes =2;
        dog.setLeg(4);
        dog.getLeg();
        String typeOfDog = Dog.type="Omnivores";
        System.out.println("Type of Dog : "+typeOfDog);
    }
}

class Animal{
    public int eyes;
    public String name ;
    private int legs ;
    static String type;

    public void setLeg(int legs){
         if(legs==2){
            this.legs=legs;
            System.out.println("Two footed animal.");
         }
         else if(legs == 4){
            this.legs=legs;
            System.out.println("Four footed animal.");
         }
    }

    public void getLeg(){
        System.out.println("Legs of "+this.name+" : "+this.legs);
    }
}

class Horse extends Animal{

}
class Dog extends Animal{

}