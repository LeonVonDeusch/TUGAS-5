package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Cube extends Shape implements ThreeDimensional, Weightable {
    // konstanta sisi kubus
    private double edge;
    // konstanta massa kubus
    private double mass;

    // konstruktor default
    public Cube() {}

    // konstruktor untuk inisialisasi sisi dan massa kubus
    public Cube(double edge, double mass) {
        this.edge = edge;
        this.mass = mass;
    }

    // method untuk menghitung luas permukaan kubus
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // method untuk menghitung volume kubus
    public double getVolume() {
        return edge * edge * edge;
    }

    // method untuk menghitung berat kubus
    public double getWeight() {
        return mass * g;
    }

    // method menampilkan informasi kubus
    public void printInfo() {
        System.out.println("Name        : Cube");
        System.out.println("Surface Area        : " + getSurfaceArea());
        System.out.println("Volume      : " + getVolume());
        System.out.println("Weight      : " + getWeight());
    }
}
