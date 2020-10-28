package com.example.demo;

import java.util.*;

public class MicroTask2Application {

    public static void main(String[] args) {

        String sentence;

        Scanner scan = new Scanner(System.in);

        int counter;

        System.out.println("Please write a sentence below: ");

        sentence = scan.nextLine();

        String[] array = sentence.split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word : array)
            if (hashMap.containsKey(word)) {
                counter = hashMap.get(word);
                hashMap.put(word, counter + 1);
            } else {
                hashMap.put(word, 1);
            }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
            System.out.println("the word " + "(" + entry.getKey() + ")" + " is used  " + entry.getValue() + " time(s)");

    }
}

//below: a try to sort the words in descending order of number of occurrences

        /*
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        hMap.put(entry.getKey(), entry.getValue());
        System.out.println(hMap);

        Map sortedMap = sortByValue(hMap);
        System.out.println(sortedMap);
    }

    HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put(entry.getKey(), entry.getValue());
        System.out.println(map);
        Map sortedMap = sortByValue(map);
        System.out.println(sortedMap);
    }

    public static Map sortByValue(Map unsortedMap) {
        HashMap<String, Integer> sortedMap = new HashMap<String, Integer>();
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }
}
class ValueComparator implements Comparator {
    Map map;
    public ValueComparator(Map map) {
        this.map = map;
    }
    public int compare(Object keyA, Object keyB) {
        Comparable valueA = (Comparable) map.get(keyA);
        Comparable valueB = (Comparable) map.get(keyB);
        return valueB.compareTo(valueA);
    }
}
    }

}

class ValueComparator implements Comparator {
    Map map;

    public ValueComparator(Map map) {
        this.map = map;
    }

    public int compare(Object keyA, Object keyB) {
        Comparable valueA = (Comparable) map.get(keyA);
        Comparable valueB = (Comparable) map.get(keyB);
        return valueB.compareTo(valueA);
    }
}
       */