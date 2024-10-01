import java.util.Scanner;

public class PemilihBilangan16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Menggunakan ternary operator untuk menentukan genap atau ganjil
        String hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        
        System.out.println("Angka " + angka + " termasuk " + hasil);
        sc.close();
    }
}
