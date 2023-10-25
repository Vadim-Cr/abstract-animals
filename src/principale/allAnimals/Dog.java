package principale.allAnimals;

import principale.Animal;
import principale.interfaces.CanSwim;

public class Dog extends Animal implements CanSwim {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Quando mi arrabbio faccio 'BAU'");
    }

    @Override
    public void mangia() {
        System.out.println("Quando ho fame mangio di tutto, ma soprattuto carne");
    }

    @Override
    public void nuota() {
        System.out.println("Che bella l'acqua");
    }
}
