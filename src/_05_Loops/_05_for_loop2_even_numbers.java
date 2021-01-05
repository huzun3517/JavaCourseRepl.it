package _05_Loops;

public class _05_for_loop2_even_numbers {

    public static void main(String[] args) {

    //    0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
        //Not: 0 ve 100 dahildir.

        //Kodu aşağıya yazınız.

    /*    int sayac = 0;

        do {
            if (sayac % 2 == 0){
                System.out.println(sayac);
            }
            sayac++;

        }while (sayac <= 100);

     */

        for (int i=0; i<=100; i++){
            if (i % 2 ==0) {
                System.out.println(i);
            }

        }
    }
}
