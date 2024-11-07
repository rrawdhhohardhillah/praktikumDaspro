import java.util.Scanner;

public class Tugas3Bagian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelamat datang di Porseni Politeknik seluruh Indonesia!");
        System.out.println("\nList cabang olahraga Porseni Politeknik se-Indonesia 2024");
        System.out.println("- Badminton");
        System.out.println("- Tenis Meja");
        System.out.println("- Basket");
        System.out.println("- Bola voly");

        int jumlahCabor = 0;

        do {
            System.out.print("\nMasukkan cabang olahraga: ");
            String cabor = sc.nextLine();

            System.out.println("Cabang Olahraga: " + cabor);
            System.out.println("\nMasukkan 5 nama atlet!");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama Atlet ke-" + i + ": ");
                String atlet = sc.nextLine();
            }

            jumlahCabor++;
        } while (jumlahCabor < 4);

        System.out.println("Pendaftaran selesai.");
        sc.close();
    }
}