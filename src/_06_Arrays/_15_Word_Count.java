package _06_Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str =  "Removes white space from both ends of a string";

        String[] arr = str.split(" ");

        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            count++;
        }
        System.out.println(count);
    }
}