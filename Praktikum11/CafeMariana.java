import java.util.Scanner;

public class CafeMariana {

    static int[][] penjualan;
    static int jumlahMenu;
    static int jumlahHari;

    // Fungsi untuk menginputkan jumlah menu dan jumlah hari
    public static void inisialisasiData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();

        penjualan = new int[jumlahMenu][jumlahHari]; // Inisialisasi array sesuai jumlah menu dan hari
    }

    // Fungsi untuk menginputkan data penjualan
    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlahMenu; i++) { // Iterasi untuk setiap menu
            System.out.println("Masukkan data penjualan untuk Menu ke-" + (i + 1) + " (" + jumlahHari + " hari):");
            for (int j = 0; j < jumlahHari; j++) { // Iterasi untuk setiap hari
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanPenjualan() {
        System.out.println("Data Penjualan Selama " + jumlahHari + " Hari:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan total penjualan dari hari pertama hingga hari terakhir
    public static void tampilkanTotalHarian() {
        System.out.println("Total Penjualan Harian:");
        for (int j = 0; j < jumlahHari; j++) {
            int total = 0;
            for (int i = 0; i < jumlahMenu; i++) {
                total += penjualan[i][j];
            }
            System.out.println("Hari ke-" + (j + 1) + ": " + total);
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void menuTerlaris() {
        int maxMenu = -1, maxPenjualan = 0;
        for (int i = 0; i < jumlahMenu; i++) {
            int totalMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalMenu += penjualan[i][j];
            }
            if (totalMenu > maxPenjualan) {
                maxPenjualan = totalMenu;
                maxMenu = i + 1;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah Menu ke-" + maxMenu + " dengan total penjualan " + maxPenjualan);
    }

    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rataRataPenjualan() {
        System.out.println("Rata-rata Penjualan Untuk Setiap Menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            int totalMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalMenu += penjualan[i][j];
            }
            double rataRata = totalMenu / (double) jumlahHari;
            System.out.println("Menu ke-" + (i + 1) + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Rekap Penjualan Cafe!");
        System.out.println("1. Inisialisasi data penjualan");
        System.out.println("2. Input data penjualan");
        System.out.println("3. Tampilkan seluruh data penjualan");
        System.out.println("4. Tampilkan total penjualan harian");
        System.out.println("5. Tampilkan menu dengan penjualan tertinggi");
        System.out.println("6. Tampilkan rata-rata penjualan untuk setiap menu");
        System.out.println("7. Keluar");

        while (true) {
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    inisialisasiData();
                    break;
                case 2:
                    inputPenjualan();
                    break;
                case 3:
                    tampilkanPenjualan();
                    break;
                case 4:
                    tampilkanTotalHarian();
                    break;
                case 5:
                    menuTerlaris();
                    break;
                case 6:
                    rataRataPenjualan();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
    }
}