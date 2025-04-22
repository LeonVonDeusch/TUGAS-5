package praktic.geometry.bases;

public abstract class CircularShape {
    private double radius; // radius lingkaran
    protected final int PI_NUMERATOR = 22; // pembilang pi
    protected final int PI_DENOMINATOR = 7; // penyebut pi

    // konstanta gravitasi
    public CircularShape() {}

    // Konstruktor untuk inisialisasi radius lingkaran
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // Method untuk menghitung luas lingkaran
    public double getRadius() {
        return radius;
    }
}