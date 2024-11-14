import java.util.Scanner;

public class SearchNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];
        System.out.println("Masukkan nilai mahasiswa:");

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu di mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}