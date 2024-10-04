package PemilihanHari16;
import java.util.Scanner;

public class PemilihanHari16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String dayType;

        System.out.print("Masukkan angka (1-7): ");
        angka = sc.nextInt();

        switch (angka) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid Number";
        }

        System.out.println(angka + " is a " + dayType);
        sc.close();
    }
}
