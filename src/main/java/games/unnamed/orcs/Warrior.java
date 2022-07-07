package games.unnamed.orcs;

public class Warrior extends Orc {

    public Warrior() {
        super(200, 200);
    }

    @Override
    public String toString() {
        return "Warrior" + super.toString();
    }
}
