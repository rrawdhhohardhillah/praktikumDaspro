import java.util.Scanner;

public class Tugas3KafePemesanan {
    public static void main(String[] args) {
        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                               "Kentang Goreng", "Teh Tarik", "Cappuccino", 
                               "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine();
        
        String[] daftarPesanan = new String[jumlahPesanan];
        int[] jumlahPesananMenu = new int[jumlahPesanan];
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama menu yang ingin dipesan: ");
            String menuPesanan = scanner.nextLine();
            
            int indeksMenu = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(menuPesanan)) {
                    indeksMenu = j;
                    break;
                }
            }
            
            if (indeksMenu != -1) {
                daftarPesanan[i] = daftarMenu[indeksMenu];
                System.out.print("Masukkan jumlah pesanan untuk " + menuPesanan + ": ");
                jumlahPesananMenu[i] = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia.");
                i--;
            }
        }
        
        double totalHarga = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            int indeksMenu = -1;
            for (int j = 0; j < daftarMenu.length; j++) {
                if (daftarMenu[j].equalsIgnoreCase(daftarPesanan[i])) {
                    indeksMenu = j;
                    break;
                }
            }
            if (indeksMenu != -1) {
                totalHarga += daftarHarga[indeksMenu] * jumlahPesananMenu[i];
            }
        }
        
        System.out.println("\nDaftar Pesanan Anda:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(daftarPesanan[i] + " - Jumlah: " + jumlahPesananMenu[i]);
        }
        
        System.out.println("\nTotal harga yang perlu dibayar: Rp " + totalHarga);
        
        scanner.close();
    }
}