package games.unnamed.humans;

import java.util.ArrayList;
import java.util.List;

public class HumanBuilderImpl implements HumanBuilder {

    @Override
    public Footman recruitFootman() {
        return new Footman();
    }

    @Override
    public List<Footman> recruitFootmen(int count) {
        List<Footman> footmen = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            footmen.add(new Footman());
        }
        return footmen;
    }

    @Override
    public Archer recruitArcher() {
        return new Archer();
    }

    @Override
    public List<Archer> recruitArchers(int count) {
        List<Archer> archers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            archers.add(new Archer());
        }
        return archers;
    }

    @Override
    public Knight recruitKnight() {
        return new Knight();
    }

    @Override
    public List<Knight> recruitKnights(int count) {
        List<Knight> knights = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            knights.add(new Knight());
        }
        return knights;
    }
}
