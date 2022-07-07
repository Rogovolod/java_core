package games.unnamed;

import games.unnamed.humans.Archer;
import games.unnamed.humans.Footman;
import games.unnamed.humans.Human;
import games.unnamed.humans.Knight;
import games.unnamed.orcs.OrcBuilder;
import games.unnamed.orcs.OrcBuilderImpl;

import java.util.ArrayList;

public class GameInit {

    private static final RaceActions raceActions = new RaceActionImpl();
    private static final OrcBuilder orcBuilder = new OrcBuilderImpl();

    public static void main(String[] args) {
        ArrayList<Race> humans = new ArrayList<>();
        humans.add(new Archer());
        humans.add(new Knight());
        humans.add(new Footman());
        ArrayList<Race> orcs = new ArrayList<>(orcBuilder.recruitWarrior(3));
        System.out.println(orcs);
        System.out.println(humans);

        raceActions.fight(orcs, humans);
        System.out.println(orcs);
        System.out.println(humans);

    }

}
