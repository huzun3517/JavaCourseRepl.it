package _06_Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..

        int[] arr = {15 , 25, 22, 18, 30};

        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int max2 = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max2 && arr[i] != max)
                max2 = arr[i];
        }
        System.out.println(max2);

    }
}
     /*   Arrays.sort(dizi);
        System.out.println(dizi[dizi.length-2]);
      */