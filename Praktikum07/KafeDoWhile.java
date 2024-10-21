import java.util.Scanner;

public class KafeDoWhile{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int kopi, teh, roti;
    String namaPelanggan;
    int hargaKopi = 12000, hargaRoti = 2000, hargaTeh = 7000;
    int totalHarga;
    
    do{
        System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();
        if(namaPelanggan.equalsIgnoreCase("batal")){
        System.out.println("Transaksi dibatalkan. ");
        break;
        }
        System.out.println("Jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.println("Jumlah teh : ");
        teh = sc.nextInt();
        System.out.println(" jumlah roti: ");
        roti = sc.nextInt();
        totalHarga = (kopi * hargaKopi) + (teh + hargaTeh) + (roti * hargaKopi);
        System.out.println("Total yang harus dibayar: rp " + totalHarga);
        sc.nextLine(); //Keterangan: sc.nextLine(); setelah print totalHarga merupakan sintaks untuk
        //membersihkan newline dari buffer
    }while(true);
}
}