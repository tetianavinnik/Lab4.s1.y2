package kick;

import lotr.Character;

public class ElfKick implements BasicKick {
    @Override
    public void kick(Character kicker, Character kicked) {
        if (kicker.getPower()>kicked.getPower()) {
            kicked.setHp(0);
        }
        else {
            kicked.setPower(kicked.getPower()-1);
        }
    }
}
