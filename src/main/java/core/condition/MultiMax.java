package core.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int rsl = (first < second) ? second : first;
        int result = (rsl > third) ? rsl : third;
        return result;
    }
}