
import java.util.Scanner;

public class Pemilihan2Percobaan316 {
    public static void main(String[] args) {

      Scanner enamBelas = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        

        System.out.print("Masukkan kategori : ");
        kategori = enamBelas.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan :");
        penghasilan = enamBelas.nextInt();

    if (kategori.equalsIgnoreCase("pekerja")) {
        if(penghasilan <= 20000000)
            pajak = 0.1;
        else if ( penghasilan <= 3000000)
             pajak = 0.15;
        else
            pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("penghasil Bersih : " + gajiBersih); 
        
    }else if (kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 25000000)
            pajak = 0.15;

        else if (penghasilan <= 3500000)
            pajak = 0.2;

        else
            pajak = 0.25;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("penghasilan Bersih : " + gajiBersih);

    }else
        System.out.print("Masukkan kategori Salah ");
    
        enamBelas.close();
    }
   
}
