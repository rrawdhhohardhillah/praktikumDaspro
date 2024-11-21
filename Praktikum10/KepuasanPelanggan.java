import java.util.Scanner;

public class KepuasanPelanggan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        double[][] hasilSurvei = new double[jumlahResponden][jumlahPertanyaan];

        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalPerResponden = 0;
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai untuk Pertanyaan ke-" + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextDouble();
                totalPerResponden += hasilSurvei[i][j];
            }

            double rataRataResponden = totalPerResponden / jumlahPertanyaan;
            System.out.println("Nilai rata-rata responden " + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }

            double rataRataPertanyaan = totalPerPertanyaan / jumlahResponden;
            System.out.println("Nilai rata-rata Pertanyaan ke-" + (j + 1) + ": " + rataRataPertanyaan);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }

        double rataRataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);

        sc.close();
    }
}