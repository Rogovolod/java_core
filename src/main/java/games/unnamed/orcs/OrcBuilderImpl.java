package games.unnamed.orcs;

import java.util.ArrayList;
import java.util.List;

public class OrcBuilderImpl implements OrcBuilder {

    @Override
    public Hunter recruitHunter() {
        return new Hunter();
    }

    @Override
    public List<Hunter> recruitHunters(int count) {
        List<Hunter> hunters = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            hunters.add(new Hunter());
        }
        return hunters;
    }

    @Override
    public Warrior recruitWarrior() {
        return new Warrior();
    }

    @Override
    public List<Warrior> recruitWarrior(int count) {
        List<Warrior> warriors = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            warriors.add(new Warrior());
        }
        return warriors;
    }

    @Override
    public Chief recruitChief() {
        return new Chief();
    }

    @Override
    public List<Chief> recruitChief(int count) {
        List<Chief> chiefs = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            chiefs.add(new Chief());
        }
        return chiefs;
    }

}
