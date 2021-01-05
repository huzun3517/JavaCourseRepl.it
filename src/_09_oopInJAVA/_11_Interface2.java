package _09_oopInJAVA;

import java.util.ArrayList;
import java.util.Scanner;

interface deliveryOptions {

    int getTheTotal(ArrayList<String> list);
    String isFreeShipping(ArrayList<String> list);

    int AmazonMinFreeDelivery = 10000;
    int CostcoMinFreeDelivery =  15000;



}

class Amazon implements deliveryOptions {


    @Override
    public int getTheTotal(ArrayList<String> list) {

        int returnSayi =0;

        for (String s: list){
            if (s.charAt(s.length()-1) == 'K'){
                s=s.replaceAll("[^0-9]","");
                returnSayi += Integer.parseInt(s)*1000;
            }
            else {
                s=s.replaceAll("[^0-9]","");
                returnSayi += Integer.parseInt(s);
            }

        }

        return returnSayi;
    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {

        String strReturn = "";

        if (getTheTotal(list) > AmazonMinFreeDelivery){
            strReturn = "you are eligible for free delivery";
        }

        if (getTheTotal(list) < AmazonMinFreeDelivery){
            strReturn = "you need to buy " + (AmazonMinFreeDelivery - getTheTotal(list)) + " amount of item.";
        }


        return strReturn;
    }



}

class Costco implements deliveryOptions{


    @Override
    public int getTheTotal(ArrayList<String> list) {
        int returnSayi =0;

        for (String s: list){
            if (s.charAt(s.length()-1) == 'K'){
                s=s.replaceAll("[^0-9]","");
                returnSayi += Integer.parseInt(s)*1000;
            }
            else {
                s=s.replaceAll("[^0-9]","");
                returnSayi += Integer.parseInt(s);
            }

        }

        return returnSayi;
    }

    @Override
    public String isFreeShipping(ArrayList<String> list) {
        String strReturn = "";

        if (getTheTotal(list) > CostcoMinFreeDelivery){
            strReturn = "you are eligible for free delivery";
        }

        if (getTheTotal(list) < CostcoMinFreeDelivery){
            strReturn = "you need to buy " + (CostcoMinFreeDelivery - getTheTotal(list)) + " amount of item.";
        }


        return strReturn;
    }
}

public class _11_Interface2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<String> listNumbers = new ArrayList<>();

        int counter = 0;
        while(scan.hasNext()){

            listNumbers.add(scan.nextLine());
            counter++;
            if(counter==11){

                break;
            }

        }

        // while calling the methods in the classes use listNumbers arraylist

        Amazon amazon = new Amazon();
        Costco costco = new Costco();

        System.out.println(amazon.isFreeShipping(listNumbers));
        System.out.println(costco.isFreeShipping(listNumbers));



    }

}

/*
    deliveryOptions  class interface'i (arayüz) yap.

    3 tane method oluşturun.
    birinci methodun ismi getTheTotal parametresi String arraylist, return type'ı int.
    ikinci methodun ismi isFreeShipping  parametresi String arraylist, return type'ı String.

    iki tane int oluşturun.
    ilki AmazonMinFreeDelivery = 10000
    ikincisi CostcoMinFreeDelivery =  15000

    Amazon class'ının içinde
    getTotal method'unun içinde 3 tane bunun gibi Stirng vardır.  $3K , $200 , $1K

    String'leri int yapınız ve toplam sayıya return ediniz.
     not: sonunda K olan sayılar 1000 ile çarpılır.

    isFreeShipping  methodunun içinde
     Eğer toplam sayı AmazonMinFreeDelivery'den yüksekse "you are eligible for free delivery" yadırınız.

    Eğer toplam sayı AmazonMinFreeDelivery'den düşük ise "you need to buy ..... amount of item." yazdrınız.


    Costco  class'ının içinde
    getTotal'ı ve deliveryOptions interface'indeki isFreeShipping methodunu override edin.

    getTotal methodunun içinde bunun gibi Stringler vardır. $3K , $200 , $1K

    Stirng'leri int yapın ve toplam sayıya return edin.
    not: sonunda K olan sayılar 1000 ile çarpılır.

    isFreeShipping  methodunun içinde;
    Eğer toplam sayı CostcoMinFreeDelivery'dan yüksekse "Print you are eligible for free delivery" yazdırınız.
    Eğer toplam sayı CostcoMinFreeDelivery 'dan düşükse "print you need to buy ..... amount of item." yazdırınız.

    main method'un içinde
    iki tane objects oluşturun.
    Biri Amazon class'ı için
    Diğeri costco classı için.

    amazon class'ının içinde isFreeShipping'i çağırın ve sonucu yazdırın.
    costco class'ının içinde isFreeShipping'i çağırın ve sonucu yazdırın.
 */
