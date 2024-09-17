package Praktikum03;

/**
 * ContohVariable16
 */
public class ContohVariable16 {

    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umurSayaSekarang, tinggi));
        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + $ipk);

    }
}