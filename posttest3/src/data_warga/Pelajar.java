package data_warga;

public class Pelajar extends Warga{
    private String nisn;
    public Pelajar(String nik, String nama, int umur, String jenisKelamin, String agama, String nisn) {
        super(nik, nama, umur, jenisKelamin, agama);
        this.nisn = nisn;
    }
    
}