package _06_Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        int num = 123;
        String str = String.valueOf(num);

        String str2 = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
}

    /*  int sayi = 123;
        String str = String.valueOf(sayi);

        String []dizi = str.split("");

       for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(dizi[i]);
        }
     */
