package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass; // massa bola

    // konstanta gravitasi
    public Sphere() {}

    // Konstruktor untuk inisialisasi radius dan massa bola
    public Sphere(double radius, double mass) {
        setRadius(radius);
        this.mass = mass;
    }

    // Method untuk menghitung luas permukaan bola
    public double getSurfaceArea() {
        return 4 * (PI_NUMERATOR / (double)PI_DENOMINATOR) * getRadius() * getRadius();
    }

    // Method untuk menghitung volume bola
    public double getVolume() {
        return ((double) 4 / 3) * ((double)PI_NUMERATOR / PI_DENOMINATOR) * Math.pow(getRadius(), 3);
    }

    // Method untuk menghitung berat bola
    public double getWeight() {
        return mass * g;
    }

    // Method untuk menampilkan informasi bola
    public void printInfo() {
        System.out.println("Name        : Sphere");
        System.out.println("Surface Area        : " + getSurfaceArea());
        System.out.println("Volume      : " + getVolume());
        System.out.println("Weight      : " + getWeight());
    }
}
