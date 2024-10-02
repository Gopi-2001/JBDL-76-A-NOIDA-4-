package Assignment;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class fruits {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana",
                "apple", "grape", "orange", "banana", "lemon", "banana", "lemon");

        Map<String, Integer> map = new HashMap<>();

        for(String s : words){
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else map.put(s,1);
        }

        List<Map.Entry<String,Integer>> list = map.entrySet().stream()
                .sorted((e1, e2) ->  e2.getValue() - e1.getValue())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}

