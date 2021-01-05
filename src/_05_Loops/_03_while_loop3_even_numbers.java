package _05_Loops;

public class _03_while_loop3_even_numbers {

    public static void main(String[] args) {

    /*  do while loop kullanınız.
        0 ile 30 arasındaki bütün çift sayıları yazdırınız.
     */

        int x = 30;

        //Kodu aşağıya yazınız.

      do {
          x--;
          if (x % 2 == 0){
              System.out.println(x);
          }

      }while (x >= 0);






    }
}
