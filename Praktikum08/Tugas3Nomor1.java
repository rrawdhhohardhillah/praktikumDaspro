import java.util.Scanner;

public class Tugas3Nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int  ukuran = 5;

        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                if ((i == 1 || i == 2 || i == 3) && (j == 1 || j == 2 || j == 3)) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("5 ");
            }
            System.out.println();
        } 
            sc.close();
    }
}