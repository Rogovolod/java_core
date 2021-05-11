package ru.core.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapClass {

    public Map<String, Student> listToMap(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        e -> e,
                        (f, s) -> f));
    }

}
