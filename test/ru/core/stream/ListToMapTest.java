package ru.core.stream;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    @Ignore
    public void listMapTest() { //TODO CHECK THIS SHIT!!
        var s1 = new Student(50, "Popov");
        var s2 = new Student(70, "Petrov");
        var s3 = new Student(34, "Ivanov");
        var s4 = new Student(46,"Vasiliev");
        var s5 = new Student(67, "Popov");

        var students = List.of(s1, s2, s3, s4, s5);
        var ex = new HashMap<>(Map.of("Petrov", s2, "Popov", s5, "Ivanov", s3, "Vasiliev", s4));

        assertThat(ex, is(new ListToMapClass().listToMap(students)));
    }

}
