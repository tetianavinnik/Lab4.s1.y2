package lotr;

import kick.CryKick;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        CryKick cryKick = new CryKick();
        cryKick.kick(this, c);
    }
}
