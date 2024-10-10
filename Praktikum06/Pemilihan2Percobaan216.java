import java.util.Scanner;

public class Pemilihan2Percobaan216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        String member;
        int pilihan_menu;
        double jumlah_beli, total_bayar = 0;
        double diskon, harga;


        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("Ice Tea");
        System.out.println("Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih =");
        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? =");
        member = sc.nextLine();
        System.out.println("-----------------------------------------");
        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga );

            }else {
                System.out.println("Masukkan pilihan Menu dengan benar");
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salalh
            }
              //Menghitung total bayar setelah diskon
              total_bayar = harga - (harga * diskon);
              System.out.println("Total bayar setelah diskon = " + total_bayar);  
            } else if (member.equalsIgnoreCase("n")) {
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println(" Harga ricebowl = " + harga);

                }else if (pilihan_menu ==2) {
                    harga = 3000;
                    System.out.println( "Harga Ice tea = "+ harga);

                }else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = "+harga);
                }else {
                    System.out.println("Masukan pilihan menu denga benar");
                    return;
                }
              total_bayar =  harga;
            }else {
                System.out.println("Member tidak Valid");
            }

             System.out.print("Apakah Anda membayar melalui QRIS (y/n)? ");
             String bayarQRIS = sc.nextLine();
             if (bayarQRIS.equalsIgnoreCase("y")) {
                total_bayar -= 1000;
                System.out.println("Anda emndapatkan potongan harga Rp. 1.000 !");
             }
    
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            System.out.println("---------------------------------------");
            sc.close();
         }
}
    
