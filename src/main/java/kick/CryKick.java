package kick;

import lotr.Character;

public class CryKick implements BasicKick {
    @Override
    public void kick(Character kicker, Character kicked) {
        System.out.println("\uD83D\uDE2D");
    }
}
