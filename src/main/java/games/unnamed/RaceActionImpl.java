package games.unnamed;

import java.util.ArrayList;
import java.util.List;

public class RaceActionImpl implements RaceActions {

    @Override
    public void fight(List<Race> attacker, List<Race> defender) {
//        int totalAttackerStrength = attacker.stream().mapToInt(Race::getStrength).sum();
//        int totalDefenderStrength = defender.stream().mapToInt(Race::getStrength).sum();
//        int totalAttackerArmour = attacker.stream().mapToInt(Race::getArmor).sum();
//        int totalDefenderArmour = defender.stream().mapToInt(Race::getArmor).sum();
//        int totalAttackerHealth = attacker.stream().mapToInt(Race::getHealth).sum();
//        int totalDefenderHealth = defender.stream().mapToInt(Race::getHealth).sum();
        for (Race d : defender) {
            for (Race a : attacker) {
                if (!a.isDead() && !d.isDead()) {
                    d.setStrength(d.getStrength() - a.getArmor());
                    a.setStrength(a.getStrength() - d.getArmor());
                    d.setHealth(d.getHealth() - a.getStrength());
                    a.setHealth(a.getHealth() - d.getStrength());
                    if (a.getHealth() <= 0) {
                        a.setDead(true);
                        a.setStrength(0);
                        a.setArmor(0);
                        a.setHealth(0);
                    }
                    if (d.getHealth() <= 0) {
                        d.setDead(true);
                        d.setStrength(0);
                        d.setArmor(0);
                        d.setHealth(0);
                    }
                }
            }
        }

        attacker.removeIf(Race::isDead);
        defender.removeIf(Race::isDead);
    }

    @Override
    public List<Race> join(List<Race> attacker, List<Race> defender) {
        var rsl = new ArrayList<Race>();
        rsl.addAll(attacker);
        rsl.addAll(defender);
        return rsl;
    }
}
