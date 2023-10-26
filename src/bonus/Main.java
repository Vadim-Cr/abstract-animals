package bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Creator creator = new Creator();
        System.out.println("Which Player?");
        String choice = scanner.nextLine();
        try{
       Player player = creator.create(choice);
       player.play();
       player.stop();}
       catch (IllegalArgumentException e) {
           System.out.println("Invalid type of player");
       }
        scanner.close();
    }
}
