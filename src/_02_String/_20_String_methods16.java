package _02_String;

public class _20_String_methods16 {

    public static void main(String[] args) {

        /*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu buraya yazınız.

        String s1 = "    Chocolade     ";

        //1.yol
        String kaldir = s1.trim();
        System.out.println(kaldir);

        // 2.yol
        int index_C = s1.indexOf("C");
        int index_e = s1.indexOf("e");

        String ayrilan = s1.substring(index_C,index_e + 1);
        System.out.println(ayrilan);


    }
}
