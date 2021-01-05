package _07_Methods;

import java.util.Scanner;

public class _11_method11 {

    /*
    addDigits isminde bir method oluşturun.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, döndürün

    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklı olduğundan, bunu döndürün.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        System.out.println(addDigits(num));



    }
    public static int sum(int num){

        String str = String.valueOf(num);
        String[] arr = str.split("");

        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }

    public static int addDigits(int num){
        for (int i = 0; i < 4 ; i++) {
            num = sum(num);

            if (num < 10)
                break;
        }
        return num;
    }

}
