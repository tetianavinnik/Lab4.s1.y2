package lotr;

import kick.ElfKick;

public class Elf extends Character {

    public Elf() { super(10, 10);}

    public void kick(Character c) {
        ElfKick elfKick = new ElfKick();
        elfKick.kick(this, c);
    }
}
