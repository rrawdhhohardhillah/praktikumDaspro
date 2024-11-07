import java.util.Scanner;

public class Triangel16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N = ");
        int N = sc.nextInt();
        int i = 0;
        
        while (i < N) {
            int j = 0;
            while (j < i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}