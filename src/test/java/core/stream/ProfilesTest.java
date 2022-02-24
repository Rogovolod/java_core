package core.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ProfilesTest {

    @Test
    public void collectTest() {
        var one = new Address("St.Peterburg", "Pushkina", 15, 15);
        var two = new Address("Moskow", "Lomonosova", 35, 256);
        var three = new Address("Oslo", "Gyermunbu", 12, 0);
        var four = new Address("Oslo", "Gyermunbu", 12, 0);
        var five = new Address("Moskow", "Lomonosova", 35, 256);

        var rsl = new ArrayList<Profile>();
        rsl.add(new Profile(one));
        rsl.add(new Profile(two));
        rsl.add(new Profile(three));
        rsl.add(new Profile(four));
        rsl.add(new Profile(five));

        var exp = new ArrayList<Address>();
        exp.add(two);
        exp.add(three);
        exp.add(one);

        var profiles = new Profiles();

        assertThat(exp, is(profiles.collect(rsl)));
    }

}
