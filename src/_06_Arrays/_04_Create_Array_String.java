package _06_Arrays;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        // Kodu aşağıya yazınız..

        String [] arr = {"new jersey" , "new york", "boston","California"};

        String str2 ="";
        int count = 0;

        for (String str : arr) {
            str2 += str;
            count++;
        }
        System.out.println(count);
    }
}
