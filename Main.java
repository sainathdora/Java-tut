import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Animal animal = new Animal("Generic", "Huge", 120);
        // doAnimal(animal, "slow");
        Dog brownie = new Dog("corgie", "slow", 10);
        brownie.bark();
        doAnimal(brownie, "fast");
}
    public static void doAnimal(Animal animal, String speed){
        animal.Move(speed);
        animal.MakeNoise();
        System.out.println("------");
        System.out.println(animal);
    }
}