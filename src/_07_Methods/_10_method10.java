package _07_Methods;

import java.util.Scanner;

public class _10_method10 {

    /*
    ismi fib olan bir method oluşturun.
Bu methos bir int değer kabul etsin.
Return int olmalı.
Örnek 1:
         Yaygın olarak F (n) olarak gösterilen Fibonacci sayıları,
         Fibonacci sekansı adı verilen bir sekans oluşturur,
         böylece her sayı, 0 ve 1'den başlayarak önceki iki numaranın toplamıdır.
        F(0) = 0,   F(1) = 1
        F(N) = F(N - 1) + F(N - 2), for N > 1.

        Verilen N, değerleri hesaplayın,F(N).e1:
        Örnek 1:
        Girdi: 2
        Çıktı: 1
        Açıklama: F(2) = F(1) + F(0) = 1 + 0 = 1.

        Örnek2:
        Girdi: 3
        Çıktı: 2
        Açıklama: F(3) = F(2) + F(1) = 1 + 1 = 2.

        Örnek 3:
        Girdi: 4
        Çıktı: 3
        Açıklama:F(4) = F(3) + F(2) = 2 + 1 = 3.
             */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        System.out.println(fib(num));




    }
    public static int fib(int num){

        int[] Fib = new int[num + 1];

        Fib[0] = 0;
        Fib[1] = 1;

        if (num > 1){
            for (int i = 2; i < num + 1 ; i++) {
                Fib[i] = Fib[i-1] + Fib[i-2];
            }
        }
        return Fib[num];
    }
}
