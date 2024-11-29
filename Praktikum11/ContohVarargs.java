public class ContohVarargs {
    public static void tampilkanData(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void tampilkanInfo(int umur, String... namaPengunjung) {
        System.out.println("Usia: " + umur);
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        tampilkanInfo(25, "Ali", "Budi", "Citra");
    }
}