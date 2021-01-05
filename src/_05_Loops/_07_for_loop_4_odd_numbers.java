package _05_Loops;

public class _07_for_loop_4_odd_numbers {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

    /*    int i = 99;

        while (i > 0) {
            if (i % 2 == 1){
                System.out.println(i);
            }
            i--;
        }

     */
        for (int i=100; i>0; i--){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}
