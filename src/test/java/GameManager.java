import lotr.*;
import lotr.Character;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Player 1: " + c1.toString());
            System.out.println("Player 2: " + c2.toString());
            if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
                System.out.println("\uD83D\uDE2D\uD83D\uDE2D");
                break;
            }
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName());
            System.out.println("Player 1: " + c1.toString());
            System.out.println("Player 2: " + c2.toString());
            if (!c2.isAlive()) {
                System.out.println("Player 2 is dead");
                break;
            }
            else if (c1.getPower() == 0) {
                System.out.println("Player 2 is out of power");
                break;
            }
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName());
            if (!c1.isAlive()) {
                System.out.println("Player 1 is dead");
                break;
            }
            else if (c1.getPower() == 0) {
                System.out.println("Player 1 is out of power");
                break;
            }
        }
        System.out.println("Game over");
    }

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        fight(characterFactory.createCharacter(), characterFactory.createCharacter());
    }
}
