package _06_Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str=  "Hello World";

        String[] arr = str.trim().split("");
        String str2 = "";

        for (int i = arr.length-1; i >= 0 ; i--) {
            str2 += arr[i];
        }
        System.out.println(str2);
    }
}