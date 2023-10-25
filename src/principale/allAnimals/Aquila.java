package principale.allAnimals;

import principale.Animal;
import principale.interfaces.CanFly;

public class Aquila extends Animal implements CanFly {
    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Quando voglio farmi sentire faccio faccio un verso come simile ad una porta arruginita");
    }

    @Override
    public void mangia() {
        System.out.println("Quando ho fame mangio animali che caccio a grande velocità");
    }

    @Override
    public void vola() {
        System.out.println("Che fico volare!");
    }
}
