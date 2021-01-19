package Lesson_3.UniqueWords;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        array.add("Word");
        array.add("Buy");
        array.add("King");
        array.add("Buy");
        array.add("Comment");
        array.add("Array");
        array.add("Comment");
        array.add("Putnik");
        array.add("Comment");
        array.add("Post");
        array.add("Alive");
        array.add("King");
        array.add("Lion");

        for (String s: array) {
            map.put(s, Collections.frequency(array, s));
        }

        System.out.println(map);
    }
}
