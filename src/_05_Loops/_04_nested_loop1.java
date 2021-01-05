package _05_Loops;

public class _04_nested_loop1 {

    public static void main(String[] args) {

        /*
        Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
        örn:
        length(uzunluk): 7
        width(genişlik): 5
        Output:
        #####
        #####
        #####
        #####
        #####
        #####
        #####
                 */


        for (int i =0; i<7; i++) {

            for (int j=0; j<5;j++){ // iç döngü
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
