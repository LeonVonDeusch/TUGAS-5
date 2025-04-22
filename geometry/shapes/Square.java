package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

public class Square extends Shape implements TwoDimensional {
    private double side; // konstanta sisi persegi

    // konstanta sisi persegi
    public Square(){}

    // Konstruktor untuk inisialisasi sisi persegi
    public Square(double side){
        this.side = side;
    }

    // Method untuk mendapatkan sisi persegi
    public double getArea(){
        return side * side;
    }

    // Method untuk menghitung keliling persegi
    public double getPerimeter(){
        return 4 * side;
    }

    // Method untuk menampilkan informasi persegi
    public void printInfo(){
        System.out.println("Name        : Square");
        System.out.println("Area        : " + getArea());
        System.out.println("perimeter       :" + getPerimeter());
    }
}
