import static interview.SpacesBetweenString.refactorSpaces;

public class MethodsSpeedTest {

    private static void refactorSpacesSpeedTest() {
        long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long currenTime = System.currentTimeMillis();
        for (int i = 0; i < 4000; i++)
            refactorSpaces("_a_b_c___");
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Runtime: " + (System.currentTimeMillis() - currenTime) + "ms");
        System.out.println("Memory used: " + ((afterUsedMem - beforeUsedMem)) + "b");
    }

    public static void main(String[] args) {
        refactorSpacesSpeedTest();
    }

}
