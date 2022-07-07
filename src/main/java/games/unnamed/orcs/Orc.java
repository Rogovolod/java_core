package games.unnamed.orcs;

import games.unnamed.Race;

public class Orc extends Race {

    public Orc(int strength, int health) {
        setStrength(strength);
        setHealth(health);
    }

    @Override
    public String toString() {
        return "Orc" + super.toString();
    }

}
