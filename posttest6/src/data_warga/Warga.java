package data_warga;

public abstract class Warga {
    protected String RT;
    protected String nik;
    protected String nama;
    protected int umur;
    protected String jenisKelamin;
    protected String agama;
    
    public abstract void display();
    
    public Warga(String rT, String nik, String nama, int umur, String jenisKelamin, String agama) {
        this.RT = rT;
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }
    public String getRT() {
      return RT;
    }
    public void setRT(String rT) {
      this.RT = rT;
    }
    public String getNik() {
      return nik;
    }
    public void setNik(String nik) {
      this.nik = nik;
    }
    public String getNama() {
      return nama;
    }
    public void setNama(String nama) {
      this.nama = nama;
    }
    public int getUmur() {
      return umur;
    }
    public void setUmur(int umur) {
      this.umur = umur;
    }
    public String getJenisKelamin() {
      return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
      this.jenisKelamin = jenisKelamin;
    }
    public String getAgama() {
      return agama;
    }
    public void setAgama(String agama) {
      this.agama = agama;
    }
    // public void display() {
    //     System.out.print("NIK : " + nik + ", Nama : " + nama + ", Umur : " + umur + ", Jenis Kelamin : " + jenisKelamin
    //             + ", agama : " + agama);
    // }
    public void buatLaporan(String laporan){
      System.out.println("Nama Pelapor = " + this.nama);
      System.out.println("Laporan = "+ laporan);
    }
}