package Praktikum03;

import java.util.Scanner;

public class GajiBulananKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonus = 0.10;
        double pajak = 0.5;

        System.out.println("Masukkan lama jam kerja: ");
        double jamKerja = sc.nextDouble();

        System.out.println("Masukkan upah per jam: ");
        double upahPerjam = sc.nextDouble();

        double totalgaji = jamKerja*upahPerjam;
        double bonuss = bonus*totalgaji;

        System.out.println("Total sebelum pajak : " + totalgaji);

        double dikurangipajak = pajak* totalgaji;
        System.out.println("Total gaji kotor: " + dikurangipajak);

        double gajibersih = dikurangipajak - pajak;
        System.out.println("Gaji bersih: " + gajibersih);
    }
}
