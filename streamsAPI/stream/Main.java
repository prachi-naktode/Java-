package com.prachi.streamsAPI.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //creating an empty stream
//        Stream<String> s1 = Stream.empty();
//        s1.forEach((ele) -> System.out.println(ele));

//        Collection<String> arr = Arrays.asList("Java", "CPP","Python");
//        Stream<String> s2 = arr.stream();
//        s2.forEach((ele) -> System.out.println(ele));

        //Array can be made as Stream Source
//        Stream<String> arr = Stream.of("oo", "pp", "uu");
//        arr.forEach(ele -> System.out.println(ele));

        List<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4,2,6,1,3));

        //filter return a new stream
//        arr.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));

        //map return a new stream
//        arr.stream().map(n -> n*2).forEach(n -> System.out.println(n));

        //sorted return new stream
//        arr.stream().sorted().forEach(n -> System.out.println(n));

        //distinct()
//        arr.stream().distinct().forEach(n -> System.out.println(n));

        //collect() -> convert the stream into collections or another result
//        List<Integer> arr2 = arr.stream().filter(n -> n%2==0).collect(Collectors.toList());

        //reduce return a number
//        int sum = arr.stream().reduce(0,(a,b) -> a+b);
//        System.out.println(sum);

        //count
//        long c = arr.stream().count();
//        System.out.println(c);

        //fndFirst() returns the first ele
//        int first = arr.stream().findFirst().orElse(Integer.valueOf("0"));
//        System.out.println(first);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
