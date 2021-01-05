package _05_Loops;

public class _10_nested_loop4 {

    public static void main(String[] args) {

        /*
        Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *

         */

        //Kodu aşağıya yazınız.

        /*

           *      2 boşluk + 1 yıldız
          ***     1 boşluk + 3 yıldız
         *****    0 boşluk + 5 yıldız





        int s,k;
        int yildiz = 1;

        int bosluk = 6-1;

        for (k = 0; k < 6; k++) {

            for (s=0; s < bosluk; s++) {
                System.out.print(" ");
            }
            for (s = 0; s < yildiz; s++) {
                System.out.print("*");
            }
            System.out.println("");
            bosluk--;
            yildiz+=2;
        }
        
         */


        for (int satir =1; satir >=5; satir++) {

            for (int sutun =1; sutun <=satir; sutun++){

                System.out.print("*");
            }
            System.out.println("");
        }





    }
}
