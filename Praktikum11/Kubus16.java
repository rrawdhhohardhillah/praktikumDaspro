import java.util.Scanner;

public class Kubus16 {
    public static int hitungVolume(int p) {
        int volume = p * p * p;
        return volume;
    }

    public static int hitungPermukaan(int p) {
        int luas = (6 * p) * (6 * p);
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int p = sc.nextInt();

        int volume, luas;

        volume = hitungVolume(p);
        System.out.println("Volume kubus adalah " + volume);

        luas = hitungPermukaan(p);
        System.out.println("Luas permukaan kubus adalah: " + luas);
    }
}