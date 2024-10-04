package Praktikum03;
import java.util.Scanner;
public class TotalTagihanListrik16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifListrik = 1500;
        System.out.print("Masukkan lama penggunaan:");
        double lamaPenggunaan = sc.nextDouble();
        double totalTagihan = tarifListrik * lamaPenggunaan;
        System.out.print("total tagihan: " + totalTagihan);
        System.out.println(totalTagihan > 500);

        sc.close();

    }
}
