package data_warga;

public class Pelajar extends Warga{
    private String nisn;
    private String namaAyah;
    public Pelajar(String RT, String nik, String nama, int umur, String jenisKelamin, String agama,  String nisn, String namaAyah) {
        super(RT, nik, nama, umur, jenisKelamin, agama);
        this.nisn = nisn;
        this.namaAyah = namaAyah;
    }
    @Override
    public void buatLaporan(String laporan){
        System.out.println("Nama Ayah = "+namaAyah);
        super.buatLaporan(laporan);
      }

    public void display() {
        System.out.print("NIK : " + nik + ", Nama : " + nama + ", Umur : " + umur + ", Jenis Kelamin : " + jenisKelamin
                + ", agama : " + agama + ", nisn: " + nisn);
    }
}