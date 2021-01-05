package _07_Methods;

import java.util.Scanner;

public class _02_method2 {
    /*
    Create one method which name is middleWord
    "OrtaKelime" isminden bir method oluşturun.
    Bu method String'i parametre olarak almalı.
    Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
    Ortadaki kelimeyi return yapınız.

    Örnek: Ben Java'yı seviyorum.
    print : Java'yı

    Örnek2:
    Java'yı kolayca öğreniyorum.
    print: kolayca
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String str = scanner.nextLine();

        System.out.println( middleWord(str));




    }
    public static String middleWord(String str){

        String[] arr = str.trim().replaceAll("\\s+"," ").split(" ");

        String middle = arr[(arr.length-1) / 2];

        return middle;
    }
}
/*
        String[] arr = str.trim().replaceAll("[' ']+"," ").split(" ");


        String middle = "";

        if (arr.length % 2 == 1){
            middle = arr[(arr.length-1) / 2];
        }
        else {
             middle += arr[(arr.length) / 2 -1 ] + " " + arr[arr.length / 2];
        }

        return middle;
         */
