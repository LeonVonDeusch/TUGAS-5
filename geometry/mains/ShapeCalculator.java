// deklarasi package
package praktic.geometry.mains;

/*
NAMA = Dandy Zikri Arifandi
NIM  = 245150707111035


########     ###    ##    ## ########  ##    ## 
##     ##   ## ##   ###   ## ##     ##  ##  ##  
##     ##  ##   ##  ####  ## ##     ##   ####   
##     ## ##     ## ## ## ## ##     ##    ##    
##     ## ######### ##  #### ##     ##    ##    
##     ## ##     ## ##   ### ##     ##    ##    
########  ##     ## ##    ## ########     ##    
*/

//mengimport class Scanner 
import java.util.Scanner;
//mengimport class Circle, Square, Sphere, Cube
import praktic.geometry.shapes.*;

public class ShapeCalculator {
    // Warna untuk teks
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";

    // Garis pemisah
    public static final String Line  = "========================================";

     public static void main(String[] args) {
        Scanner inputPengguna = new Scanner(System.in);
        
        System.out.println(RED + Line + RESET ); // Garis pemisah
        System.out.println(BLACK + "Shape Calculator" );  // Judul
        System.out.println("Dandy Zikri Arifandi"); // Nama
        System.out.println("245150707111035" + RESET); // NIM
        
        System.out.println(RED + Line + RESET ); // Garis pemisah
        System.out.println(BLACK + "2D Circle" + RESET); // Judul
        System.out.println(RED + Line + RESET ); // Garis pemisah
        System.out.print(BLACK + "Enter Radius          : ");// Teks untuk meminta input
        double radiusCircle = inputPengguna.nextDouble(); // Input radius lingkaran
        System.out.println(RED + Line + RESET ); // Garis pemisah
        Circle circle = new Circle(radiusCircle); // Membuat objek lingkaran
        circle.printInfo(); // Menampilkan informasi lingkaran
        
        System.out.println(RED + Line + RESET ); // Garis pemisah
        System.out.println(BLACK + "2D Square" + RESET);// Judul
        System.out.println(RED + Line + RESET );// Garis pemisah
        System.out.print(BLACK + "Enter Side            : ");// Teks untuk meminta input
        double side = inputPengguna.nextDouble();// Input sisi persegi
        System.out.println(RED + Line + RESET );// Garis pemisah
        Square square = new Square(side);// Membuat objek persegi
        square.printInfo();//   Menampilkan informasi persegi

        System.out.println(RED + Line + RESET );// Garis pemisah
        System.out.println(BLACK + "3D Weightable Cube" + RESET); // Judul
        System.out.println(RED + Line + RESET );// Garis pemisah
        System.out.print(BLACK + "Enter edge            : ");// Teks untuk meminta input
        double edge = inputPengguna.nextDouble();// Input sisi kubus
        System.out.print(BLACK + "Enter mass            : ");// Teks untuk meminta input
        double massCube = inputPengguna.nextDouble();// Input massa kubus
        System.out.println(RED + Line + RESET );// Garis pemisah
        Cube cube = new Cube(edge, massCube);// Membuat objek kubus
        cube.printInfo();// Menampilkan informasi kubus
        

        System.out.println(RED + Line + RESET );// Garis pemisah
        System.out.println(BLACK + "3D Weightable Sphere" + RESET); // Judul
        System.out.println(RED + Line + RESET );// Garis pemisah
        System.out.print(BLACK + "Enter Radius          : "); // 
        double radiusSphere = inputPengguna.nextDouble();// Input radius bola
        System.out.print(BLACK + "Enter mass            : "); // Teks untuk meminta input
        double massSphere = inputPengguna.nextDouble();// Input massa bola
        System.out.println(RED + Line + RESET );// Garis pemisah
        Sphere sphere = new Sphere(radiusSphere, massSphere); // Membuat objek bola
        sphere.printInfo(); // Menampilkan informasi bola

        System.out.println(RED + Line + RESET ); // Garis pemisah
        System.out.println(BLACK + "Volume of Cube and Sphere"); // Judul
        System.out.println("POLYMORPHISM: INTERFACE" + RESET); // Subjudul
        System.out.println(RED + Line + RESET ); // Garis pemisah 
        System.out.print(BLACK + "Enter edge            : "); // Teks untuk meminta input
        double edge2 = inputPengguna.nextDouble(); // Input sisi kubus
        System.out.print(BLACK + "Enter radius          : "); // Teks untuk meminta input
        double radius2 = inputPengguna.nextDouble(); // Input radius bola
        System.out.print(BLACK + "Enter mass            : " ); // Teks untuk meminta input
        double mass2 = inputPengguna.nextDouble(); // Input massa
        Cube cube2 = new Cube(edge2, mass2); // Membuat objek kubus
        Sphere sphere2 = new Sphere(radius2, mass2); // Membuat objek bola
        System.out.println(RED + Line + RESET ); // Garis pemisah
        System.out.println(BLACK + "Cube's volume : " + cube2.getVolume() + RESET); // Menampilkan volume kubus
        System.out.println(BLACK + "Sphere's volume : " + sphere2.getVolume() + RESET); // Menampilkan volume bola
        System.out.println(BLACK + "Weight : " + (cube2.getWeight() + sphere2.getWeight()) + RESET); // Menampilkan berat total
        
        inputPengguna.close(); // Menutup scanner
    }
}
