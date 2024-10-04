package Praktikum03;
import java.util.Scanner;

public class Bank16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
        int lamaMenabung;

        persentaseBunga = 0.0002;

        // untuk dibugging (agar tau erornya dimana) untuk mengeluarkan output yang kita mau serta mengetahui letak erornya dimana  
        System.out.println("Masukkan jumlah tabungan awal: "); 
        //fungsi sc disini untuk mendeklarasi nilai tabungan awal
        tabunganAwal = sc.nextDouble();
        //kemudian fungsi dari nextin adalah meninput type data int dari pengguna
        System.out.println("Masukkan lama menabung (bulan): ");
        lamaMenabung = sc.nextInt();

        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        tabunganAkhir = tabunganAwal + bunga;

        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan akhir: " + tabunganAkhir);

        sc.close();
    }
}
