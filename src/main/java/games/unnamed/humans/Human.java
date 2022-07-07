package games.unnamed.humans;

import games.unnamed.Race;

public class Human extends Race {

    public Human(int strength, int health, int armor) {
        setArmor(armor);
        setStrength(strength);
        setHealth(health);
    }

    @Override
    public String toString() {
        return "Human" + super.toString() + ", armor=" + getArmor();
    }
}
