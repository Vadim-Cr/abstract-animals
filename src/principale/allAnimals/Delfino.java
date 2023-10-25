package principale.allAnimals;

import principale.Animal;
import principale.interfaces.CanSwim;

public class Delfino extends Animal implements CanSwim {
    public Delfino(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Nei film sono conosciuto per che faccio 'kii-kii-ki'");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio prinipalmente pesce, ma qualche volta qualcuno mi passa quallcosa di più buono");
    }

    @Override
    public void nuota() {
        System.out.println("Mi sento come un pesce nell'acuqa");
    }
}
