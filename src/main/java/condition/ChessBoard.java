package condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (Math.abs(x1-x2) == Math.abs(y1-y2) && cellIsExist(x1) && cellIsExist(x2) && cellIsExist(y1) && cellIsExist(y2)) {
            return Math.abs(x1 - x2);
        }
        return 0;
    }

    public static boolean cellIsExist(int i) {
        return i >= 0 && i <= 7;
    }

}
