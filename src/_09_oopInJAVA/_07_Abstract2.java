package _09_oopInJAVA;

import java.util.Scanner;

abstract class Calculator {

    abstract int calculating(int num1, int num2);

}

class Sum extends Calculator{

    @Override
    int calculating(int num1, int num2) {
        return num1 + num2;
    }
}

class Divide extends Calculator{

    @Override
    int calculating(int num1, int num2) {
        return num1 / num2;
    }
}

class Multiply extends Calculator{

    @Override
    int calculating(int num1, int num2) {
        return num1 * num2;
    }
}

class Substract extends Calculator{

    @Override
    int calculating(int num1, int num2) {
        return num1 - num2;
    }
}

public class _07_Abstract2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Sum sum = new Sum();
        System.out.println(sum.calculating(num1,num2));

        Divide divide = new Divide();
        System.out.println( divide.calculating(num1,num2));

        Multiply multiply = new Multiply();
        System.out.println(multiply.calculating(num1,num2));

        Substract substract = new Substract();
        System.out.println(substract.calculating(num1,num2));

    }







}


 /*
     6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main

    Calculator'ı a super class yap.

    super class'ın içinde;
    calculating adında bir abstract method oluturunuz.
            Burada iki tane int parametresi vardır.
             return tipi int'dir.

    Sum class'ın içinde;
            Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
            iki parametreyi topla ve sonucu return et.

    Divide class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi böl ve sonucu return et.

    Multiply class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi çarp ve sonucu return et.

    Substract class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi birbirinden çıkart ve sonucu return et.

    Main class'ın içinde
             scanner object oluşturunuz.
             iki int oluştur ve bu iki int değişkenine scanner ata.

    Sum methodu çağır ve sonucu yazdır.
    Divide methodu çağır ve sonucu yazdır.
    Multiply methodu çağır ve sonucu yazdır.
    Substract methodu çağır ve sonucu yazdır.
     */

