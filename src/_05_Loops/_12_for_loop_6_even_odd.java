package _05_Loops;

public class _12_for_loop_6_even_odd {

    public static void main(String[] args) {

        /*

        0 ile 100 arasındaki sayıları kapsayan bir kod yazınız.

        Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.

        Eğer sayı çift sayıysa;

        This number is even and number is 0

        Eğer sayı tek sayıysa;

        This number is odd and number is 1

        yazdırmalıdır.

        Sonuç böyle olmalıdır.

        This number is even and number is 0
        This number is odd and number is 1
        This number is even and number is 2
        This number is odd and number is 3
        ...
        ...
        ....
        ...100'e kadar devam etmeli.


        Not: 0 ve 100 dahildir.
                 */

        //Kodu aşağıya yazınız

    /*    int sayac = 0;

        while (sayac <= 100){
            if (sayac % 2 == 0 ){
                System.out.println("This number is even and number is " + sayac);
            }
            else if (sayac % 2 == 1){
                System.out.println("This number is odd and number is " + sayac);
            }
            sayac++;
        }

     */

        for (int i =0; i<=100; i++){
            if (i % 2 == 0) {
                System.out.println("This number is even and number is " + i);
            }
            else if (i % 2 == 1) {
                    System.out.println("This number is odd and number is " + i);
            }
        }


    }
}
