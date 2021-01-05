package _05_Loops;

public class _08_nested_loop_2 {

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

        for (int satir =1; satir <=5; satir++) {

            for (int sutun =1; sutun <=satir; sutun++){
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
