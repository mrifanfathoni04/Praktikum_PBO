package data_warga;

public class Warga {
    String nik;
    String nama;
    int umur;
    String jenisKelamin;
    String agama;

    public Warga(String nik, String nama, int umur, String jenisKelamin, String agama){
        this.nik = nik;
        this.nama=nama;
        this.umur=umur;
        this.jenisKelamin=jenisKelamin;
        this.agama=agama;
    }   
    public void display() {
        System.out.print("NIK : " + nik + ", Nama : " + nama + ", Umur : " + umur +", Jenis Kelamin : "+jenisKelamin + ", agama : "+agama);
    }
}