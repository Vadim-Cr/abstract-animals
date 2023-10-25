package principale;

import principale.allAnimals.Aquila;
import principale.allAnimals.Delfino;
import principale.allAnimals.Dog;
import principale.allAnimals.Passerotto;
import principale.interfaces.CanFly;
import principale.interfaces.CanSwim;

public class Main {
    public static void main(String[] args) {
    Dog ciro = new Dog("Ciro");
    Passerotto titi = new Passerotto("Titi");
    Aquila fernando = new Aquila("Fernando");
    Delfino ainz = new Delfino("Ainz");
    Animal[] animals = {ciro, titi, fernando, ainz};
    for (Animal animal :animals) {
        System.out.println("Ciao io sono: " + animal.getName() + " e ");
        animal.dormi();
        animal.mangia();
        animal.verso();
        if (animal instanceof CanSwim){
            ((CanSwim) animal).nuota();
        }
        if (animal instanceof CanFly){
            ((CanFly)animal).vola();
        }
        System.out.println("*************************************************");
    }


    }
}
