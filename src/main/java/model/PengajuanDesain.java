package model;

public class PengajuanDesain {
    private int idPengajuan;
    private Pemohon pemohon;
    private String jenisDesain;
    private String informasiTambahan;
    private String deadline;
    private String status;

    public PengajuanDesain(int idPengajuan, Pemohon pemohon, String jenisDesain, String informasiTambahan, String deadline) {
        this.idPengajuan = idPengajuan;
        this.pemohon = pemohon;
        this.jenisDesain = jenisDesain;
        this.informasiTambahan = informasiTambahan;
        this.deadline = deadline;
        this.status = "Pending";
    }

    public int getIdPengajuan() {
        return idPengajuan;
    }

    public Pemohon getPemohon() {
        return pemohon;
    }

    public String getJenisDesain() {
        return jenisDesain;
    }

    public String getInformasiTambahan() {
        return informasiTambahan;
    }

    public void setInformasiTambahan(String informasiTambahan) {
        this.informasiTambahan = informasiTambahan;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }
}