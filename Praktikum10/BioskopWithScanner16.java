import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String kosong = "Kosong";
        
        String[][] penonton = new String[4][2];

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = kosong;  
            }
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                boolean validInput = false;

                while (!validInput) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1].equals(kosong)) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton berhasil ditambahkan!");
                            validInput = true;
                        } else {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi yang lain.");
                        }
                    } else {
                        System.out.println("Baris atau kolom tidak valid. Harap masukkan nilai yang benar.");
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j].equals(kosong) ? "***\t" : penonton[i][j] + "\t");
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
                System.out.println("Keluar dari program...");
                sc.close();
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}