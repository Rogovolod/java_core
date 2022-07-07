package games.unnamed.orcs;

import java.util.List;

public interface OrcBuilder {

    Hunter recruitHunter();
    List<Hunter> recruitHunters(int count);
    Warrior recruitWarrior();
    List<Warrior> recruitWarrior(int count);
    Chief recruitChief();
    List<Chief> recruitChief(int count);

}
