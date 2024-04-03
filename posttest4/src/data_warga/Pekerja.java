package data_warga;

public class Pekerja extends Warga{
    private String npwp;
    public Pekerja(String nik, String nama, int umur, String jenisKelamin, String agama, String npwp) {
        super(nik, nama, umur, jenisKelamin, agama);
        this.npwp = npwp;
    }
    public void buatLaporan(String laporan, String jenisLaporan){
        System.out.println("Jenis Laporan = " + jenisLaporan);
        super.buatLaporan(laporan);
      }
}
