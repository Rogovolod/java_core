package games.seabattle;

public class CheckImp implements Check {

    @Override
    public boolean outOfBondsException(int i, int j) {
        return i >= 0 && i <= 9 && j >= 0 && j <= 9;
    }

    @Override
    public boolean freeSpaceRight(byte[][] battleground, int i, int j) {
        if (outOfBondsException(i, j + 1) && outOfBondsException(i + 1, j + 1) &&
                outOfBondsException(i - 1, j + 1)) {
            return battleground[i][j + 1] == 0 && battleground[i + 1][j + 1] == 0 &&
                    battleground[i - 1][j + 1] == 0;
        }
        return false;
    }

    @Override
    public boolean freeSpaceAround(byte[][] battleground, int i, int j) {
        if (outOfBondsException(i + 1, j) && outOfBondsException(i - 1, j) &&
                outOfBondsException(i, j + 1) && outOfBondsException(i, j - 1) &&
                outOfBondsException(i + 1, j - 1) && outOfBondsException(i + 1, j + 1) &&
                outOfBondsException(i - 1, j - 1) && outOfBondsException(i - 1, j + 1)) {
            return battleground[i + 1][j] == 0 && battleground[i - 1][j] == 0 &&
                    battleground[i][j + 1] == 0 && battleground[i][j - 1] == 0 &&
                    battleground[i + 1][j - 1] == 0 && battleground[i + 1][j + 1] == 0 &&
                    battleground[i - 1][j - 1] == 0 && battleground[i - 1][j + 1] == 0 &&
                    battleground[i][j] == 0;
        }
        return false;
    }

    @Override
    public boolean freeSpaceDown(byte[][] battleground, int i, int j) {
        if (outOfBondsException(i + 1, j) && outOfBondsException(i + 1, j + 1) &&
                outOfBondsException(i + 1, j - 1)) {
            return battleground[i + 1][j] == 0 && battleground[i + 1][j - 1] == 0 &&
                    battleground[i + 1][j + 1] == 0;
        }
        return false;
    }

}
