package Lesson_3.TelephoneNumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TelephoneNumbers {
    Map<String, HashSet<String>> map = new HashMap<>();
    public void add(String surname, String... numbers){
        map.put(surname, new HashSet<>(Arrays.asList(numbers)));
    }

    public void get(String surname){
        if (map.get(surname) != null) {
            HashSet<String> set = map.get(surname);
        for (String s: set) {
            System.out.println(s);
        }
        }else{
            System.out.println("По данному человеку нет данных в справочнике");
        }
    }
}
