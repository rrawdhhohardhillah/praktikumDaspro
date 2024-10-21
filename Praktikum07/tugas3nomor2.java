import java.util.Scanner;

public class tugas3nomor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi = 0, total = 0, biaya = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    if (durasi > 5) {
                        biaya = 12500;
                    } else {
                        biaya = durasi * 3000;
                    }
                } 
                else if (jenis == 2) {
                    if (durasi > 5) {
                        biaya = 10000;
                    } else {
                        biaya = durasi * 2000;
                    }
                }

                total += biaya;
            }
        } while (jenis != 0);

        System.out.println("");
        System.out.println("Total bayar parkir: " + total);

        sc.close();
    }
}
