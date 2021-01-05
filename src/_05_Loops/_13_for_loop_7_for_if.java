package _05_Loops;

public class _13_for_loop_7_for_if {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

        Sonuç bu şekilde olmalıdır.
        0
        20
        40
        60
        80
        100

         */

        //Kodu aşağıya yazınız.

    /*    int sayac = 0;

        while (sayac <= 100){
              if (sayac % 4 == 0 && sayac % 5 == 0){
                System.out.println(sayac);
            }
            sayac++;
        }

     */

        for (int i =0; i<=100; i++){
            if (i % 4 == 0 && i % 5 == 0){
                System.out.println(i);
            }

        }



    }
}
