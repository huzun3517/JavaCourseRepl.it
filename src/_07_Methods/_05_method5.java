package _07_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_method5 {
     /*
        getSum isminde bir method oluşturun.
        Parametresi ArrayList'tir.
        Dizideki tüm $ ları kaldır ve tüm sayıları topla
        return yaptğımız veri tipi 'int' olmalıdır.
        sonuç 0'dan küçükse, -1 yazdırın.

        Örnek1:
        ArrayList = $13, $15, $20
        Cevap = 48 olmalı

        Örnek 2 :
        ArrayList= $-13, $0, $0
        Cevap = -1 olmalı.
         */


    public static void main(String[] args) {

    //    ArrayList<String >arrayList = new ArrayList<>(Arrays.asList("$13","$15","$20"));

        ArrayList<String >arrayList = new ArrayList<>(Arrays.asList("$-13","$0","$0"));

        System.out.println(getSum(arrayList));




    }
    public static int getSum   (ArrayList<String>arrayList){

        int sum = 0;
        for (String str : arrayList) {
            String str2 = str.replace("$","");
            sum += Integer.parseInt(str2);
        }
        if (sum < 0){
            return -1;
        }
        else {
            return sum;
        }
    }
}
