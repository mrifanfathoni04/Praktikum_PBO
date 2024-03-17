package data_warga;

public class Warga {
    private String nik;
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String agama;

    public Warga(String nik, String nama, int umur, String jenisKelamin, String agama) {
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public String getAgama() {
        return agama;
    }
    public void setNik(String newNik) {
        this.nik = newNik;
      }
    public void setNama(String newNama) {
        this.nama = newNama;
      }
    public void setUmur(int newUmur) {
        this.umur = newUmur;
      }
    public void setJenisKelamin(String newJenisKelamin) {
        this.jenisKelamin = newJenisKelamin;
      }
    public void setAgama(String newAgama) {
        this.agama = newAgama;
      }
    public void display() {
        System.out.print("NIK : " + nik + ", Nama : " + nama + ", Umur : " + umur + ", Jenis Kelamin : " + jenisKelamin
                + ", agama : " + agama);
    }
}