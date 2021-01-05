package _05_Loops;

import java.util.Scanner;

public class _14_Factorial_of_a_number {

    public static void main(String[] args) {

        /*
        Scanner ile yazılan herhangi bir sayının faktöriyelini hesaplayabilecek bir kod yazınız.
        Örnek:

        Sayı:4
        faktöriyel: 1*2*3*4=24

        Sayı:5
        faktöriyel: 1*2*3*4*5=120
         */

        Scanner scan = new Scanner(System.in);
        int useIntAsMax = scan.nextInt();
        //Kodu aşağıya yazınız.

     /* int sayac = 1;
        int faktor = 1;

        while (sayac <= useIntAsMax){
          faktor *= sayac;
            sayac++;
        }
        System.out.println(faktor);

      */
        int faktoriyel = 1;
        for (int i =1; i<=useIntAsMax; i++){
            faktoriyel *= i;
        }
        System.out.println(faktoriyel);



    }
}
