package _08_Collections;

import java.util.HashMap;
import java.util.Scanner;

public class _20_Map4 {
    /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

    public static void main(String[] args) {

        HashMap<Integer,String > hm = new HashMap<>();

        hm.put(1,"New jersey");
        hm.put(2,"New York");
        hm.put(3,"London");
        hm.put(4,"Paris");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Şehir giriniz: ");
        String str = scanner.nextLine();

    //    int num = 3;
    //    String str = "Miami";

        System.out.println( update(hm,num,str));


    }
    /*
    public static HashMap<Integer,String> update(HashMap<Integer,String> hm, int num, String str) {

        if (hm.containsKey(num)){
            hm.put(num,str);
           // hm.replace(num,str);
        }
        return hm;

    }

     */
    public static HashMap<Integer,String> update(HashMap<Integer,String> hm, int num, String str) {

        for (Integer dd : hm.keySet()) {
            if (dd == num) {
                hm.put(num,str);
            }

        }
        return hm;

    }


}
