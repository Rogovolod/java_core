package games.unnamed;

import java.util.List;

public interface RaceActions {

    void fight(List<Race> attacker, List<Race> defender);
    List<Race> join(List<Race> attacker, List<Race> defender);

}
