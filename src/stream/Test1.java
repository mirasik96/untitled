package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(String::length).collect(Collectors.toList());

        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
                return el;
            } else {
                el = 111;
                return el;
            }}).toArray();

        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(set2);
        List<Integer> list3 = set.stream().map(String::length).collect(Collectors.toList());
        System.out.println(list3);
    }
}
