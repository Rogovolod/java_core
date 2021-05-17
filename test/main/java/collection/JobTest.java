package collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {
    Job job1 = new Job("A Reboot server", 3);
    Job job2 = new Job("B Fix bugs", 4);
    Job job3 = new Job("C Impl task", 1);
    Job job4 = new Job("D Drink some tea", 2);
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameAndPriorityWithSameNames() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertEquals(-1, rsl);
    }
    @Test
    public void whenComparatorByNameD() {
        ArrayList<Job> ex = new ArrayList<>();
        ex.add(job4);
        ex.add(job3);
        ex.add(job2);
        ex.add(job1);
        ArrayList<Job> ac = new ArrayList<>();
        ac.add(job2);
        ac.add(job1);
        ac.add(job4);
        ac.add(job3);
        Collections.sort(ac, new JobDescByName());
        Assert.assertEquals(ex.toString(), ac.toString());
    }
    @Test
    public void whenComparatorByNameI() {
        ArrayList<Job> ex = new ArrayList<>();
        ex.add(job1);
        ex.add(job2);
        ex.add(job3);
        ex.add(job4);
        ArrayList<Job> ac = new ArrayList<>();
        ac.add(job2);
        ac.add(job1);
        ac.add(job4);
        ac.add(job3);
        Collections.sort(ac, new JobDescByNameIncrease());
        Assert.assertEquals(ex.toString(), ac.toString());
    }
    @Test
    public void whenComparatorByPriorityD() {
        ArrayList<Job> ex = new ArrayList<>();
        ex.add(job2);
        ex.add(job1);
        ex.add(job4);
        ex.add(job3);
        ArrayList<Job> ac = new ArrayList<>();
        ac.add(job1);
        ac.add(job2);
        ac.add(job3);
        ac.add(job4);
        Collections.sort(ac, new JobDescByPriority());
        Assert.assertEquals(ex.toString(), ac.toString());
    }
    @Test
    public void whenComparatorByPriorityI() {
        ArrayList<Job> ex = new ArrayList<>();
        ex.add(job3);
        ex.add(job4);
        ex.add(job1);
        ex.add(job2);
        ArrayList<Job> ac = new ArrayList<>();
        ac.add(job1);
        ac.add(job2);
        ac.add(job3);
        ac.add(job4);
        Collections.sort(ac, new JobDescByPriorityIncrease());
        Assert.assertEquals(ex.toString(), ac.toString());
    }


}