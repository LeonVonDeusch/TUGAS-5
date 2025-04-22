package praktic.geometry.bases;

public abstract class Shape {
    private String name; // nama bentuk

    // konstanta default
    public Shape(){}

    // konstruktor untuk inisialisasi nama bentuk
    public void setName(String inputName) {
        this.name = inputName;
    }

    // method untuk mendapatkan nama bentuk
    public String getName() {
        return name;
    }

    // method untuk menghitung luas bentuk
    public abstract void printInfo();
}
