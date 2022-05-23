package games.seabattle;

import java.util.Random;

public class SeaBattle {

    protected static byte smallShip = 4;
    protected static byte mediumShip = 3;
    protected static byte bigShip = 2;
    protected static byte leviathan = 1;

    private static final Check check = new CheckImp();
    private static final Random random = new Random();
    private static final Draw draw = new DrawImp();
    private static final byte[][] enemyBattleground = new byte[10][10]; // need two more field: hiddenBattleground and playerBattleground

    public static void main(String[] args) {
        autoShipsArrangement(enemyBattleground);
        draw.battlegroundField(enemyBattleground);
        draw.shot(enemyBattleground, 5, 5); // example shooting
        draw.battlegroundField(enemyBattleground);
    }

    public static void autoShipsArrangement(byte[][] battleground) {
        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                if (check.freeSpaceAround(battleground, i, j)) {
                    if (random.nextBoolean() && leviathan > 0) {
                        draw.leviathanShip(battleground, i, j);
                    } else if (random.nextBoolean() && bigShip > 0) {
                        draw.largeShip(battleground, i, j);
                    } else if (random.nextBoolean() && mediumShip > 0) {
                        draw.mediumShip(battleground, i, j);
                    } else if (random.nextBoolean() && smallShip > 0) {
                        draw.smallShip(battleground, i, j);
                    }
                }
            }
        }
    }

}
