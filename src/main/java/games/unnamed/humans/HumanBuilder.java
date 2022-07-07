package games.unnamed.humans;

import java.util.List;

public interface HumanBuilder {

    Footman recruitFootman();
    List<Footman> recruitFootmen(int count);
    Archer recruitArcher();
    List<Archer> recruitArchers(int count);
    Knight recruitKnight();
    List<Knight> recruitKnights(int count);

}
