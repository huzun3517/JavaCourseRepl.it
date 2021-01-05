package _05_Loops;

public class _09_nested_loop3 {

    public static void main(String[] args) {

        /*

        Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır.

                *
              * *
            * * *
          * * * *
        * * * * *

         */

        //Kodu aşağıya yazınız.

        for (int satir =1; satir <=5; satir++) { // satır kontrolü

            for (int bosluk =5- satir; bosluk > 0; bosluk--){ // boşluk kontrolü
                System.out.print(" ");
            }

            for (int sutun =1; sutun <=satir; sutun++){  // sütun kontrolü
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
