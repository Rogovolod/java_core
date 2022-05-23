package games.seabattle;

public interface Draw {

    void smallShip(byte[][] battleground, byte i, byte j);
    void mediumShip(byte[][] battleground, byte i, byte j);
    void largeShip(byte[][] battleground, byte i, byte j);
    void leviathanShip(byte[][] battleground, byte i, byte j);
    void battlegroundField(byte[][] battleground);
    void shot(byte[][] battleground, int i, int j);

}
