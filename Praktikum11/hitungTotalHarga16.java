import java.util.Scanner;

public class hitungTotalHarga16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENU KAFE ====");
        System.out.println("1. Kari - Rp 15,000");
        System.out.println("2. Soto - Rp 20,000");
        System.out.println("3. Wonton - Rp 22,000");
        System.out.println("4. Jus Buah - Rp 12,000");
        System.out.println("5. Es Jeruk - Rp 10,000");
        System.out.println("6. Es Teler - Rp 18,000");
        System.out.println("===================");

        int totalHargaSebelumDiskon = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6) atau 0 untuk selesai: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int hargaItem = hitungTotalHarga(pilihanMenu, banyakItem);
            totalHargaSebelumDiskon += hargaItem;

            System.out.print("\nApakah Anda ingin menambah menu? (y/n): ");
            sc.nextLine();
            String pilihanTambahMenu = sc.nextLine();

            if (!pilihanTambahMenu.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nTotal harga sebelum diskon: Rp" + totalHargaSebelumDiskon);
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int hargaSetelahDiskon = hitungDiskon(totalHargaSebelumDiskon, kodePromo);

        System.out.println("Harga setelah diskon: Rp" + hargaSetelahDiskon);

        sc.close();
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga *= 0.5;
            System.out.println("Diskon 50% berhasil diterapkan.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga *= 0.7;
            System.out.println("Diskon 30% berhasil diterapkan.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid, tidak ada diskon yang diterapkan.");
        }
        return totalHarga;
    }
}