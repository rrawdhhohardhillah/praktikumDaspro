import java.util.Scanner;

public class Kafe16 {
    public static void Menu(String kodePromo) {
        System.out.println("Selamat datang, Pelanggan!");
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");

        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Selamat! Anda mendapatkan diskon 50% untuk setiap pembelian!");
                break;
            case "DISKON30":
                System.out.println("Selamat! Anda mendapatkan diskon 30% untuk setiap pembelian!");
                break;
            default:
                System.out.println("Kode promo tidak valid.");
        }

        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode promo Anda: ");
        String kodePromo = scanner.nextLine();
        Menu(kodePromo);
        scanner.close();
    }
}