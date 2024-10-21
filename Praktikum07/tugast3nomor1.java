import java.util.Scanner;

public class tugast3nomor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jumlahTiket = 0, totalTiketTerjual = 0;
        double hargaTiket = 50000, harga = 0, totalHarga = 0, diskon = 0;
        String lanjut = "";
       
        do {
            System.out.print("masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            sc.nextLine();

            if (jumlahTiket > 0) {
                harga = jumlahTiket * hargaTiket;
                if (jumlahTiket > 10) {
                    diskon = 0.15;
                    harga -= harga * diskon;
                } else if (jumlahTiket > 4) {
                    diskon = 0.10;
                    harga -= harga * diskon;
                }

                totalTiketTerjual += jumlahTiket;
                totalHarga += harga;

                System.out.println("");
                System.out.println("tiket terjual: " + jumlahTiket);
                System.out.println("harga penjualan tiket: " + harga);
            }

            System.out.print("apakah ingin melanjutkan? (y/t): ");
            lanjut = sc.nextLine();
            System.out.println("------------------------------");
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("");
        System.out.println("total tiket terjual: " + totalTiketTerjual);
        System.out.println("total harga penjualan tiket: " + totalHarga);

        sc.close();

       
    }
}