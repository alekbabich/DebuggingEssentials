package com.babich.debug;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bob", "Sam", "Rachel", "Heather", "Brian", "Chris", "Ray", "brady");
        
        names.stream()
                .filter(n -> n.toUpperCase().startsWith("B"))
                .filter(n -> n.length() > 4)
                .forEach(System.out::println);

        System.out.println("****************************************");

        List<String> fourCharacterBNames = names.stream()
                .filter(n -> n.startsWith("B") && n.length() > 4)
                .collect(Collectors.toList());

        for (String name : fourCharacterBNames) {
            System.out.println(name);
        }
    }
}
