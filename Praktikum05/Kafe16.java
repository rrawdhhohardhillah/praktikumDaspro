package Kafe16;
import java.util.Scanner;

public class Kafe16 {
   
    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasikan variable untuk menyimpan nilai input
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        // Tuliskan perintah untuk membaca input kemudian menyimpannya ke dalam variable
        System.out.println("Masukkan menu");
        menu = sc.nextLine();
        System.out.println("Masukkan ukuran cup (S, M, L): ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        // Tentukan harga menu dengan switch-case
        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia.");
                sc.close();
                return; // Menghentikan program jika menu tidak valid
        }

        // Hitung total harga
        double totalHarga = hargaMenu * jumlah;

        // Update total harga berdasarkan ukuran cup yang dipilih
        switch (ukuranCup) {
            case 'S':
                break; // Tidak ada perubahan harga
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Ukuran cup yang dipilih tidak tersedia.");
                sc.close();
                return; // Menghentikan program jika ukuran tidak valid
        }

        // Tentukan nilai diskon berdasarkan status & hitung nominal bayar
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        // Tampilkan ringkasan item yang dibeli serta nominal bayar
        System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar : " + nominalBayar);
        sc.close();
    }
}
