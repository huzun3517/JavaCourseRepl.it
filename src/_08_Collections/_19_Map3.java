package _08_Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class _19_Map3 {

    /*
    ismi returnValue() olan bir method oluşturun.
    Parametresi    String-Integer HashMap
    Return tipi ArrayList
    Bir Hashmap oluşturun ve değerleri Integer ve String'lerden oluşmalı.
      Map
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm DEĞERLERİ (values) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Lion", 1);
        hm.put("Tiger", 2);
        hm.put("Elephant", 3);
        hm.put("Cat", 4);
        hm.put("Dog", 5);

        System.out.println(returnValue(hm));

    }
    /*
    public static ArrayList<Integer> returnValue(HashMap<String, Integer> hm) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer vl : hm.values()) {
            arrayList.add(vl);
        }
        return arrayList;
    }

     */


    public static ArrayList<Integer> returnValue(HashMap<String, Integer> hm) {
        ArrayList<Integer> arrayList = new ArrayList<>(hm.values());
        return arrayList;

    }
}