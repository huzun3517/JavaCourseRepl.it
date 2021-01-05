package _07_Methods;

import java.util.Scanner;

public class _04_method4 {
    /*
    adı  reverseWord olan bir method oluşturun
    Bu methodun String olarak bir parametresi olmalıdır
    Ve bu cümledeki kelimelerle tersine çevirmeli
    Ters halini yazdırın.

    Örnek 1 :
    Dize: Java yazın
    dönüş şöyle olmalıdır:  yazın Java

    Örnek 2:
    Dize: Sakin olun ve evde kalın
    dönüş olmalı: kalın evde ve olun sakin
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();

        System.out.println(reverseWord(str));




    }
    public static String reverseWord  (String str){

        String[] arr =  str.trim().replaceAll("\\s+"," ").split(" ");

        String strTers = "";

        for (int i = arr.length-1; i >= 0; i--) {

            strTers += arr[i] + " ";
        }

        return strTers.trim();
    }
}
