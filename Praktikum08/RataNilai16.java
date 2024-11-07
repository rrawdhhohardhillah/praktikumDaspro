import java.util.Scanner;

public class RataNilai16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int i = 1 ;
      int j = 1;
      int nilaiMhs;
      float nilai, totalNilai, rataNilai ;
      
      while (i <= 5) {
        System.out.println("Masukkan nilai mahasiswa ke-" + i);

        totalNilai = 0;
        for (j=1; j<=5 ; j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilaiMhs = sc.nextInt();
            totalNilai+= nilaiMhs;
      }
        rataNilai= totalNilai/5;
        System.out.println("Rata - rata nilai mahasiswa ke-"+ i +"adalah"+ rataNilai );
        i++;
      }
    }
    
}
