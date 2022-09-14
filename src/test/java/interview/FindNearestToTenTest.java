package interview;

import org.junit.Assert;
import org.junit.Test;

public class FindNearestToTenTest {

    @Test
    public void find() {
        final int[] array = new int[]{3, 4, 5, 6, 44, 55, -45, 3, 2, 45, 8, 45, 23, 33, 22, -145, 54, 9, 11};
        final int[] array2 = new int[]{-100, 100};
        Assert.assertEquals(11, FindNearestToTen.find(array));
        Assert.assertEquals(100, FindNearestToTen.find(array2));
    }

}