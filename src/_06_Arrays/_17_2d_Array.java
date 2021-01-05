package _06_Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        int[][] arr2D = {{2,3,2} , {4,1,5} , {7,2,5}};

        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[i].length ; j++) {

                if (arr2D[i][j] == 2 ) {
                    arr2D[i][j] = 6;
                }
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

    }
}