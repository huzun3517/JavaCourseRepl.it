package _01_Data_types;

import java.util.Scanner;

public class _30__Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        //Kodu aşağıya yazınız.

        Scanner scanner = new Scanner(System.in);

        byte agirlik;

        System.out.print("Kg cinsinden bir ağırlık giriniz: ");
        agirlik = scanner.nextByte();

        System.out.println("Ağırlık= " + agirlik + " kg");


    }
}
