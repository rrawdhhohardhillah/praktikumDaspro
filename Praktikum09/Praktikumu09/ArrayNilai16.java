import java.util.Scanner;

public class ArrayNilai16 {
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for( int i = 0; i < 10; i++) {
            System.out.print("Masukkan  nilai akhir ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc16.nextInt();
        }

        for( int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " tidak lulus.");
            }
        }
    }
}