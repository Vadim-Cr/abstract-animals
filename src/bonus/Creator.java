package bonus;

import java.util.Scanner;

public class Creator {

    public Player create(String type){
        switch (type){
            case "dvd player":
                return new LettoreDVD();
            case "playstation":
                return new PlayStation();
            default:
                throw new IllegalArgumentException("Invalid type");
        }

    }
}
