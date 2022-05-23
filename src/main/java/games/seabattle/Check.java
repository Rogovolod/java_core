package games.seabattle;

public interface Check {

    boolean outOfBondsException(int i, int j);
    boolean freeSpaceRight(byte[][] battleground, int i, int j);
    boolean freeSpaceAround(byte[][] battleground, int i, int j);
    boolean freeSpaceDown(byte[][] battleground, int i, int j);

}
