package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;


public class Circle extends CircularShape implements TwoDimensional {
    // konstruktor default
    public Circle(){}

    // kontruktor untuk inisialisasi radius lingkaran
    public Circle(double radius){
        setRadius(radius);
    }

    // method untuk menghitung luas lingkaran
    public double getArea(){ 
        return (PI_NUMERATOR * getRadius() * getRadius() / PI_DENOMINATOR);
    }

    //method untuk menghitung keliling lingkaran
    public double getPerimeter(){ 
        return (2 * PI_NUMERATOR * getRadius()/ PI_DENOMINATOR) ;
    }

    //method untuk menampilkan informasi lingkaran
    public void printInfo() {
        System.out.println("Name            : Circle");
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
    
}
