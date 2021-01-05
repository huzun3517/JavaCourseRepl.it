package _07_Methods;

import java.util.Scanner;

public class _06_method6 {
    /*
    EvenOddNums isminde bir method oluşturun.
        Bu yöntem String olan bir parametreyi kabul etsin.
        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        toplam sonucu yazdırın.
        İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.

        For example Örnek:
        String =  "6678421312"
        6+6-7+8+4+2-1-3-1+2
        sonuç 16 olmalı
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("10 haneli sayı giriniz: ");
        String str = sc.nextLine();

        //    String str = "6678421312";

        System.out.println(EvenOddNums(str));




    }
    public static int EvenOddNums(String str){

        String[] arrStr = str.trim().replace(" ","").split("");

        int[] arrInt = new int[arrStr.length];

        int sum = 0;

        for (int i = 0; i <arrInt.length ; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
            if (arrInt[i] % 2 == 0){
                sum+= arrInt[i];
            }
            else {
                sum-= arrInt[i];
            }
        }
        return sum;
    }
}
