package _06_Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2";
        String[] arrStr = str.trim().replaceAll("[^0-9,' ']","").split(" ");

        int[] arr = new int[arrStr.length];

        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}