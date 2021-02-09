package Lesson_3.TelephoneNumbers;

import java.util.*;

public class TelephoneNumbers {
    Map<String, HashSet<String>> map = new HashMap<>();
    public void add(String surname, String... numbers){
        if (!map.containsKey(surname)) {
            map.put(surname, new HashSet<>(Arrays.asList(numbers)));
        } else{
            HashSet<String> hm = map.get(surname);
            Collections.addAll(hm, numbers);
            map.put(surname,hm);
        }
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
