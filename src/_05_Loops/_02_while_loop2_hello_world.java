package _05_Loops;

public class _02_while_loop2_hello_world {

    public static void main(String[] args) {

    /*    do while loop kullanınız.
        "Hello World" yazdırın, i 0'dan büyüktür ve i'yi azaltın. (9 i, 8 i, 7 i, 6 i...)
    */

        int i = 10;

        //Kodu aşağıya yazınız.

        do {
            System.out.println("Hello World" + i);
            i--;
        }while (i > 0);


    }
}
