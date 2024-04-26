package data_warga;

public class Pekerja extends Warga{
    private String npwp;

    public Pekerja(String RT, String nik, String nama, int umur, String jenisKelamin, String agama, String npwp) {
        super(RT, nik, nama, umur, jenisKelamin, agama);
        this.npwp = npwp;
    }
    public void buatLaporan(String laporan, String jenisLaporan){
        System.out.println("Jenis Laporan = " + jenisLaporan);
        super.buatLaporan(laporan);
      }

    public String getNpwp() {
        return npwp;
    }
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public void display() {
        System.out.print("NIK : " + nik + ", Nama : " + nama + ", Umur : " + umur + ", Jenis Kelamin : " + jenisKelamin
                + ", agama : " + agama + ", npwp: " + npwp);
    }
}
