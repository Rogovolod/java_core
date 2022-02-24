package core.exceptions;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Cant found element");
        }
        return rsl;
    }

    public void main(String[] args) {
        try {
            indexOf(new String[0], "key");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}