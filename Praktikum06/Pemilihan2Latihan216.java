import java.util.Scanner;

public class Pemilihan2Latihan216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        String hari, jenisBuku;
        int jumlahBuku; 
        double diskon=0;
    
        System.out.print("Masukkan hari ini : ");
        hari = sc.nextLine();

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = sc.nextLine();

        System.out.print("Masukkan jumlah buku ");
        jumlahBuku = sc.nextInt();
    
        if (hari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")){
                diskon = 10;
                if (jumlahBuku > 2) {
                   diskon += 2;
                } else {
                    diskon = 10;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")){
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else if (jumlahBuku <= 3){
                    diskon += 1;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 5;
                } else {
                    System.out.println("Anda tidak mendapatkan diskon");
                }
            }
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }
        System.out.println ("Total diskon yang anda dapat " + diskon +"%");
        sc.close();
    }
    }