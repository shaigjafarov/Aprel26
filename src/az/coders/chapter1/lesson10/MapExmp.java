package az.coders.chapter1.lesson10;

import java.util.*;

public class MapExmp {

    public static void main(String[] args) {

        Map<String, List<String>> englishToAz = new HashMap<>();
        englishToAz.put("speed", List.of("suret"));
        englishToAz.put("size", List.of("olcu", "hecm"));

        System.out.println(englishToAz);
//        for (Map.Entry<String, List<String>> entry : englishToAz.entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println(englishToAz.get("speed"));
//

//        for (String key:englishToAz.keySet()) {
//            System.out.println(key +" " + englishToAz.get(key));
//
//
//
//        }

//        englishToAz.forEach((a, b)-> System.out.println(a + " "+ b));

        Collection<List<String>> valuesas = englishToAz.values();
        System.out.println(valuesas);









//        Map.Entry<String, List<String>> mapE = new AbstractMap.SimpleEntry<>("speed", List.of("suret"));


    }


}
