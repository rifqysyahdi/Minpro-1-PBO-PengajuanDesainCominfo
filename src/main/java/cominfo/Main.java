package cominfo;

import model.LayananPengajuan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LayananPengajuan layanan = new LayananPengajuan(scanner);

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM PENGAJUAN DESAIN COMINFO ===");
            System.out.println("1. Tambah Pengajuan");
            System.out.println("2. Tampilkan Pengajuan");
            System.out.println("3. Update Informasi Tambahan");
            System.out.println("4. Hapus Pengajuan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> layanan.tambahPengajuan();
                case 2 -> layanan.tampilkanPengajuan();
                case 3 -> layanan.updateInformasi();
                case 4 -> layanan.hapusPengajuan();
                case 5 -> berjalan = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}