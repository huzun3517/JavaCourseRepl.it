package _09_oopInJAVA;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Phone{

    public static ArrayList<String> cart = new ArrayList<>();

      int getSum(ArrayList<String> cart){

         int sum = 0;

         for (String s: cart){

             s = s.replaceAll("[^0-9]","");
             sum += Integer.parseInt(s);
         }
         return sum;
    }

    abstract void options(String s1, String s2);





}

class Apple extends Phone{


    @Override
    void options(String s1, String s2) {

        if (s1.equals("64 GB") && s2.equals("5.5 inch")){

            cart.add("$750");
        }

        if (s1.equals("64 GB") && s2.equals("6.5 inch")){
            cart.add("$850");
        }

        if (s1.equals("128 GB") && s2.equals("5.5 inch")){
            cart.add("$950");
        }

        if (s1.equals("128 GB") && s2.equals("6.5 inch")){
            cart.add("$1200");
        }
    }
}

class Samsung extends Phone{


    @Override
    void options(String s1, String s2) {

        if (s1.equals("256 GB") && s2.equals("5.5 inch")) {
            cart.add("$1000");
        }

        if (s1.equals("256 GB") && s2.equals("7.5 inch")) {
            cart.add("$1200");
        }

        if (s1.equals("512 GB") && s2.equals("5.5 inch")) {
            cart.add("$1300");
        }

        if (s1.equals("512 GB") && s2.equals("6.5 inch")) {
            cart.add("$1400");
        }
    }
}

public class _08_Abstract3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Apple apple = new Apple();
        apple.options(str1,str2);

        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();

        Samsung samsung = new Samsung();
        samsung.options(str3,str4);

        System.out.println(samsung.getSum(Phone.cart));
    }
  }

 /*
    4 class oluşturulmuştur. Phone, Apple, Samsung, Main

    Phone'u super class yapın.

    cart isimli, String'i alarak bir static arraylist oluşturun.

    getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.

    ve return tipi int;
                     arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
                     sonra bunları int'e çevirin.
                     tüm sayıları toplayın.

    ismi options olan bir abstract method oluşturun.

    Apple class'ın içinde;
                Phone class'ı extend edin.
                option method'u override edin.
                parametre olarak 2 String vardır.

    Eğer birinci String 64 GB ve 5.5 inch ise
                             cart arraylist'ine "$750" ekleyin.

    Eğer birinci String 64 GB ve 6.5 inch ise
                             cart arraylist'ine "$850" ekleyin.

    Eğer birinci String 128 GB ve 5.5 inch ise
                             cart arraylist'ine "$950" ekleyin.

    Eğer birinci String 128 GB ve 6.5 inch ise
                             cart arraylist'ine "$1200" ekleyin.

    Samsung class'ın içinde;
                Phone class'ı extend edin.
                option method'u override edin.
                parametre olarak 2 String vardır.

    Eğer birinci String 256 GB ve 5.5 inch ise
                             cart arraylist'ine "$1000" ekleyin.

    Eğer birinci String 256 GB ve 7.5 inch ise
                             cart arraylist'ine "$1200" ekleyin.

    Eğer birinci String 512 GB ve 5.5 inch ise
                             cart arraylist'ine "$1300" ekleyin.

    Eğer birinci String 512 GB ve 6.5 inch ise
                             cart arraylist'ine "$1400" ekleyin.


    Main class'ının içinde;
             scanner class object yarat.
                  iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.

    apple class'ı için object oluştur.
    options method'unu apple class'ının içine çağır.
    options parametreleri, daha önce oluşturulan iki String'lerdir.

    İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
               samsung class'ı için object oluşturun.
               options method'unu samsung class'ının içinde çağırın.
               options parametreleri daha önce oluşturulan iki String'dir.

    getSum method'unu Phone class'ının içinde çağırın.

    sonucu yazdırın.

     */
