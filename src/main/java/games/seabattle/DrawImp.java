package games.seabattle;

import java.util.Random;

import static games.seabattle.SeaBattle.smallShip;
import static games.seabattle.SeaBattle.mediumShip;
import static games.seabattle.SeaBattle.bigShip;
import static games.seabattle.SeaBattle.leviathan;

public class DrawImp implements Draw {

    private final Check check = new CheckImp();
    private final Random random = new Random();

    @Override
    public void smallShip(byte[][] battleground, byte i, byte j) {
        battleground[i][j] = 1;
        smallShip--;
    }

    @Override
    public void mediumShip(byte[][] battleground, byte i, byte j) {
        if (random.nextBoolean() && check.freeSpaceRight(battleground, i, j + 1)) {
            battleground[i][j] = 1;
            battleground[i][j + 1] = 1;
            mediumShip--;
        } else if (check.freeSpaceDown(battleground,i + 1, j)) {
            battleground[i][j] = 1;
            battleground[i + 1][j] = 1;
            mediumShip--;
        }
    }

    @Override
    public void largeShip(byte[][] battleground, byte i, byte j) {
        if (random.nextBoolean() && check.freeSpaceRight(battleground, i, j + 1) &&
                check.freeSpaceRight(battleground,i, j + 2)) {
            battleground[i][j] = 1;
            battleground[i][j + 1] = 1;
            battleground[i][j + 2] = 1;
            bigShip--;
        } else if (check.freeSpaceDown(battleground, i + 1, j) && check.freeSpaceDown(battleground, i + 2, j)) {
            battleground[i][j] = 1;
            battleground[i + 1][j] = 1;
            battleground[i + 2][j] = 1;
            bigShip--;
        }
    }

    @Override
    public void leviathanShip(byte[][] battleground, byte i, byte j) {
        if (random.nextBoolean() && check.freeSpaceRight(battleground, i, j + 1) &&
                check.freeSpaceRight(battleground, i, j + 2) && check.freeSpaceRight(battleground, i, j + 3)) {
            battleground[i][j] = 1;
            battleground[i][j + 1] = 1;
            battleground[i][j + 2] = 1;
            battleground[i][j + 3] = 1;
            leviathan--;
        } else if (check.freeSpaceDown(battleground, i + 1, j) && check.freeSpaceDown(battleground, i + 2, j) &&
                check.freeSpaceDown(battleground, i + 3, j)) {
            battleground[i][j] = 1;
            battleground[i + 1][j] = 1;
            battleground[i + 2][j] = 1;
            battleground[i + 3][j] = 1;
            leviathan--;
        }
    }

    @Override
    public void battlegroundField(byte[][] battleground) {
        System.out.print("\n\n   А Б В Г Д Е Ё Ж З И");
        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + i + "  ");
            for (int j = 0; j < 10; j++) {
                if (battleground[i][j] == 0) { // SEA █
                    System.out.print("█ ");
                    continue;
                }
                if (battleground[i][j] == 1) { // SHIP ◊
                    System.out.print("◊ ");
                    continue;
                }
                if (battleground[i][j] == 2) { // HIT ◫
                    System.out.print("◫ ");
                    continue;
                }
                if (battleground[i][j] == 3) { // MISS ◪
                    System.out.print("  ");
                }
            }
        }
    }

    @Override
    public void shot(byte[][] battleground, int i, int j) {
        if (battleground[i][j] == 1) {
            battleground[i][j] = 2;
        } else {
            battleground[i][j] = 3;
        }
    }

}
