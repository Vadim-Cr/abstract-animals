package principale.allAnimals;

import principale.Animal;
import principale.interfaces.CanFly;

public class Passerotto extends Animal implements CanFly {
    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Quando sono felice faccio 'cip-cirip'");
    }

    @Override
    public void mangia() {
        System.out.println("Quando ho fame mangio semi e insetti");
    }

    @Override
    public void vola() {
        System.out.println("che bello volare");
    }
}
