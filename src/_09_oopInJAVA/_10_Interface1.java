package _09_oopInJAVA;

import java.util.Scanner;

interface Vehicle{
    int changeGear(int gear);
    int speedUp(int speed);
    int applyBrakes(int fren);




}



class Bicycle implements Vehicle{

    int gear;
    int speed;

    @Override
    public int changeGear(int gear) {
        this.gear = gear;
        return this.gear;
    }

    @Override
    public int speedUp(int speed) {
        return this.speed += speed;
    }

    @Override
    public int applyBrakes(int fren) {
        return this.speed -= fren;
    }

    public void printAll() {
        System.out.println("current speed is " + speed + " gear count is " + gear );
    }


}

class Car implements Vehicle{

    int speed;
    int gear;

    @Override
    public int changeGear(int gear) {
        return this.gear = gear;
    }

    @Override
    public int speedUp(int speed) {
        return this.speed += speed;
    }

    @Override
    public int applyBrakes(int fren) {
        return this.speed -= fren;
    }

    public void printAll() {
        System.out.println("current speed is " + speed + " gear count is " + gear );
    }
}

public class _10_Interface1 {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        int speedIncrease = dp.nextInt();
        int speedDecrease = dp.nextInt();
        int gearForBicycle = dp.nextInt();
        int gearForCar = dp.nextInt();

        // while calling the methods in the classes use these variables

        Bicycle bicycle = new Bicycle();
        Car car = new Car();

        bicycle.changeGear(gearForBicycle);
        bicycle.speedUp(speedIncrease);
        bicycle.applyBrakes(speedDecrease);

        car.changeGear(gearForCar);
        car.speedUp(speedIncrease);
        car.applyBrakes(speedDecrease);

        bicycle.printAll();
        car.printAll();




    }








}

 /*
    Vehicle class interface'i (arayüz) yap.

        3 adet method oluşturun.
    Birinci method ismi changeGear   parametresi 1 adet int.
         İkinci method ismi speedUp parametresi 1 adet int.
            Üçüncü method ismi applyBrakes parametresi 1 adet int.

    Bicycle class Vehicle'a implementing ediliyor.

            2 adet int oluşturun. speed ve gear

    2 methodu Override edin.
        3 methodun hepsini Vehicle interface'ine Override edin.
        variable gear'ı parameter gear'a eşitleyin.

    speedUp methodunun içinde,
           speed variable'ını arttırın.

    applyBreakes methodunun içinde,
           speed variable'ını azaltın.


    printAll  isminde bir method oluşturunuz.
             print şu şekilde olmalıdır. > current speed is SPEED gear count is GEAR

    not: SPEED  speed veriable'ıdır. GEAR  gear veriable'ıdır.

    Car class Vehicle'a implementing ediliyor.

          2 adet int oluşturun. speed ve gear

    2 methodu Override edin.
        3 methodun hepsini Vehicle interface'ine Override edin.
        variable gear'ı parameter gear'a eşitleyin.

    speedUp methodunun içinde,
           speed variable'ını arttırın.

    applyBreakes methodunun içinde,
           speed variable'ını azaltın.


    printAll  isminde bir method oluşturunuz.
             print şu şekilde olmalıdır. > current speed is SPEED gear count is GEAR

    not: SPEED  speed veriable'ıdır. GEAR  gear veriable'ıdır.

    main method'un içinde;
    Bicycle class ve Car class için object oluşturun.

     changeGear , speedUp  ,  applyBrakes method'larını Bicycle ve Car class'larında çağırın.

    Önce Bicycle class'ındaki printAll'u çağırın
    Sonra Car class'ındaki printAll'u çağırın.
     */

