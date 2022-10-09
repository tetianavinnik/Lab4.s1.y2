package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Character {
    @Getter @Setter
    private int power;
    @Getter
    private int hp;

    public void setHp(int hp) {
        this.hp = hp < 1? 0: hp;
    }

    public void kick(Character c) {
    }

    public boolean isAlive() {
        return this.hp==0?false:true;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
