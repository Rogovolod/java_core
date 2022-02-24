package core.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Gecktor";
        names[1] = "Ares";
        names[2] = "Zeus";
        names[3] = "Odissei";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names.length);
        System.out.println(ages.length);
        System.out.println(prices.length);
        System.out.println(surnames.length);
    }
}
