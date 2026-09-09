package model;

import java.util.ArrayList;
import java.util.Scanner;

public class LayananPengajuan {
    private ArrayList<PengajuanDesain> daftarPengajuan;
    private Scanner scanner;

    public LayananPengajuan(Scanner scanner) {
        this.daftarPengajuan = new ArrayList<>();
        this.scanner = scanner;
    }

    public void tambahPengajuan() {
        System.out.print("ID Pengajuan: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Pemohon: ");
        String nama = scanner.nextLine();

        System.out.print("Departemen/Biro: ");
        String dept = scanner.nextLine();

        System.out.print("Jenis Desain (Poster/Feeds/dll): ");
        String jenis = scanner.nextLine();

        System.out.print("Informasi Tambahan: ");
        String info = scanner.nextLine();

        System.out.print("Deadline (Maksimal H-3): ");
        String deadline = scanner.nextLine();

        Pemohon pemohon = new Pemohon(nama, dept);
        PengajuanDesain baru = new PengajuanDesain(id, pemohon, jenis, info, deadline);

        daftarPengajuan.add(baru);
        System.out.println(">> Pengajuan berhasil ditambahkan!");
    }

    public void tampilkanPengajuan() {
        if (daftarPengajuan.isEmpty()) {
            System.out.println("Belum ada data pengajuan.");
            return;
        }

        for (int i = 0; i < daftarPengajuan.size(); i++) {
            PengajuanDesain p = daftarPengajuan.get(i);
            System.out.println("ID Pengajuan: " + p.getIdPengajuan());
            System.out.println("Nama Pemohon: " + p.getPemohon().getNamaLengkap());
            System.out.println("Departemen/Biro: " + p.getPemohon().getDepartemenBiro());
            System.out.println("Jenis Desain: " + p.getJenisDesain());
            System.out.println("Info Tambahan: " + p.getInformasiTambahan());
            System.out.println("Deadline: " + p.getDeadline());
            System.out.println("Status: " + p.getStatus());
            System.out.println("---------------------------------");
        }
    }

    public void updateInformasi() {
        System.out.print("Masukkan ID Pengajuan yang ingin diupdate: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (PengajuanDesain p : daftarPengajuan) {
            if (p.getIdPengajuan() == idTarget) {
                System.out.print("Informasi Tambahan Baru / Revisi: ");
                String infoBaru = scanner.nextLine();

                p.setInformasiTambahan(infoBaru);
                System.out.println(">> Informasi tambahan berhasil diperbarui!");
                return;
            }
        }
        System.out.println("ID Pengajuan tidak ditemukan!");
    }

    public void hapusPengajuan() {
        System.out.print("Masukkan ID Pengajuan yang ingin dihapus: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarPengajuan.size(); i++) {
            if (daftarPengajuan.get(i).getIdPengajuan() == idTarget) {
                daftarPengajuan.remove(i);
                System.out.println(">> Pengajuan berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID Pengajuan tidak ditemukan!");
    }
}