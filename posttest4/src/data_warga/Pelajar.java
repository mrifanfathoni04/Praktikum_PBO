package data_warga;

public class Pelajar extends Warga{
    private String nisn;
    private String namaAyah;
    public Pelajar(String nik, String nama, int umur, String jenisKelamin, String agama, String nisn, String namaAyah) {
        super(nik, nama, umur, jenisKelamin, agama);
        this.nisn = nisn;
        this.namaAyah = namaAyah;
    }
    @Override
    public void buatLaporan(String laporan){
        System.out.println("Nama Ayah = "+namaAyah);
        super.buatLaporan(laporan);
      }
}