package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements BasicKick {

    private static final Random randomGenerator = new Random();
    @Override
    public void kick(Character kicker, Character kicked) {
        kicked.setHp(kicked.getHp()-randomGenerator.nextInt(kicker.getPower()+1));
    }
}
