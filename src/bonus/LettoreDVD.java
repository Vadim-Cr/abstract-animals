package bonus;

public class LettoreDVD implements Player {
    @Override
    public void play() {
        System.out.println("sono un lettore dvd  e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("sono un lettore dvd  e sono in modalità stop");
    }
}
