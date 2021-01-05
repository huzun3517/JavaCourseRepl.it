package _07_Methods;

import java.util.Scanner;

public class _09_method9 {
    /*
    findTheDifference isminde bir method oluşturun.
    iki String'den oluşmalı.
    return  veri tipi char olmalı.
    Bu iki string'e  s  ve t  ismini veriniz ve küçük harflerden oluşan değerler giriniz.
    String t, rastgele karıştırma dizgileri String s tarafından oluşturulur ve
    daha sonra rastgele bir konuma bir harf daha ekler. String t ye  eklenen harfi bulun.
    (String s 'te olup, String t 'de olmayan elemanı yazdırın.)

    Örn:
    Girdi:
    s = "abcde"
    t = "abcd"
    Çıktı:
    e

    Açıklama:
    'e' harfi eklenmiştir.

    s = "qawer"
    t = "rewq"
    Çıktı:
    a
    Açıklama:
    'a' harfi eklenmiştir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("s : ");
        String s = scanner.nextLine();
        s = s.toLowerCase();

        System.out.print("t : ");
        String t = scanner.nextLine();
        t = t.toLowerCase();

        System.out.println(findTheDifference(s,t));




    }
    public static char findTheDifference(String s, String t){

        char[] arrS = s.toCharArray();
        char farkli = ' ';

        for (int i = 0; i < arrS.length ; i++) {
            if (t.indexOf(arrS[i]) < 0){
                farkli=arrS[i];
            }
        }
        return farkli;
    }
}
