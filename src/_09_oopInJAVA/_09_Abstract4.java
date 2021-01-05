package _09_oopInJAVA;

abstract class Data{

    final double pi = 3.14;

    private int radius;
    private int length ;
    private int width ;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    abstract double getArea();

}


class Circle extends Data{


    @Override
    double getArea() {
        return (pi * getRadius() * getRadius());
    }
}

class Rectangle extends Data{

    @Override
    double getArea() {
        return (getLength() * getWidth());
    }
}

public class _09_Abstract4 {



}



 /*
    Data class'ını Abstract yapın.

    ismi getArea olan bir abstract method oluşturunuz.
    return type'ı double.

    ismi pi olan bir final double variable oluşturunuz.
    pi 3.14'e eşittir.

    3 tane private int variable oluşturun
    1) radius (yarıçap)
    2) length (boy)
    3) width (en)

    bu üç variable için getter ve setter oluşturun.

    Circle classını Data class'ına extend ediniz.

    getArea methodunu override ediniz.
    circle'ın alanını hesaplayınız ve sonucu return ediniz.

    circle(daire) alan formülü: area = pi * radius * radius

    Rectangle classını Data classına extend ediniz.

    getArea methodunu Override ediniz.
    Rectangle'ın (dikdörtgen) alanını hesaplayın ve sonucu return edin.

    Rectangle alan formülü: area = length * width

    getter setter isimlerini buradan alınız

       getLength
       setLength
       getRadius
       setRadius
       getWidth
       setWidth
     */



