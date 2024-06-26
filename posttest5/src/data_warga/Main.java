package data_warga;

import java.util.ArrayList;
import java.io.*;

public final class Main {
    static InputStreamReader isp = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isp);

    static String sc() throws IOException {
        String scan = br.readLine();
        return scan;
    }

    static ArrayList<Pekerja> dataWarga = new ArrayList<>();

    static final void cls() {
        System.out.println("\033[H\033[2J");
    }

    static void delay(int x) {
        try {
            Thread.sleep(x * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static final void inputSalah() {
        System.out.println("==================================");
        System.out.println("Input yang anda masukkan salah!");
        System.out.println("==================================");
        delay(1);
    }

    static void tambahWarga() throws IOException {
        String nik = "";
        String nama = "";
        String umur = "";
        String jenisKelamin = "";
        String agama = "";
        int umurInt = 0;
        String npwp = "";
        while (true) {
            cls();
            System.out.println("           Data Warga");
            System.out.println("==================================");
            System.out.println("NIK             : " + nik);
            System.out.println("Nama            : " + nama);
            System.out.println("Umur            : " + umur);
            System.out.println("Jenis Kelamin   : " + jenisKelamin);
            System.out.println("Agama           : " + agama);
            System.out.println("NPWP            : " + npwp);
            System.out.println("==================================");
            if (nik == "") {
                System.out.print("Masukkan NIK : ");
                nik = sc();
                if (nik.length() != 16) {
                    inputSalah();
                    nik = "";
                    continue;
                }
                try {
                    Long.parseLong(nik);
                } catch (NumberFormatException e) {
                    nik = "";
                    inputSalah();
                }
                continue;

            } else if (nama == "") {
                System.out.print("Masukkan Nama : ");
                nama = sc();
                continue;
            } else if (umur == "") {
                System.out.print("Masukkan Umur : ");
                umur = sc();
                try {
                    umurInt = Integer.parseInt(umur);
                } catch (NumberFormatException e) {
                    umur = "";
                    inputSalah();
                }
                continue;
            } else if (jenisKelamin == "") {
                System.out.println("Masukkan Jenis Kelamin : ");
                jenisKelamin = sc();
                continue;
            } else if (agama == "") {
                System.out.println("Masukkan Agama : ");
                agama = sc();
                continue;
            } else if (npwp == "") {
                System.out.println("Masukkan NPWP : ");
                npwp = sc();
                continue;
            }
            final String  RT = "RT 7";
            Pekerja warga = new Pekerja(RT ,nik, nama, umurInt, jenisKelamin, agama, npwp);
            dataWarga.add(warga);
            System.out.println("    Data berhasil ditambahkan");
            delay(1);
            break;
        }

    }

    static void LihatWarga() {
        System.out.println("           Data Warga");
        System.out.println("==================================");
        for (int i = 0; i < dataWarga.size(); i++) {
            dataWarga.get(i).display();
        }
    }

    static void ubahData() throws IOException {
        System.out.println("           Data Warga");
        System.out.println("==================================");
        System.out.print("Masukkan NIK data yang ingin dirubah : ");
        String nik = sc();
        for (int i = 0; i < dataWarga.size(); i++) {
            Pekerja warga = dataWarga.get(i);
            delay(3);
            if (warga.getNik().equals(nik)) {
                System.out.print("Masukkan Nama Baru :");
                String nama = sc();
                warga.setNama(nama);
                System.out.print("Masukkan Umur baru :");
                int umur = Integer.parseInt(sc());
                warga.setUmur(umur);
                System.out.print("Masukkan Jenis Kelamin Baru :");
                String jenisKelamin = sc();
                warga.setJenisKelamin(jenisKelamin);
                System.out.print("Masukkan Agama Baru :");
                String agama = sc();
                warga.setAgama(agama);
                System.out.print("Masukkan NPWP Baru :");
                String npwp = sc();
                warga.setNpwp(npwp);
                dataWarga.set(i,warga);
                System.out.println("==================================");
                System.out.println("    Data berhasil dirubah!");
                delay(3);
                return;
            }
        }
            System.out.println("==================================");
        System.out.println("Data tidak ditemukan!");
        delay(3);
    }
    static void hapusData() throws IOException {
        System.out.println("           Data Warga");
        System.out.println("==================================");
        System.out.print("Masukkan NIK data yang ingin dihapus : ");
        String nik = sc();
        for (int i = 0; i < dataWarga.size(); i++) {
            Pekerja warga = dataWarga.get(i);
            delay(3);
            if (warga.getNik().equals(nik)) {
                dataWarga.remove(i);
                System.out.println("==================================");
                System.out.println("     Data berhasil dihapus!");
                delay(3);
                return;
            }
        }
        System.out.println("==================================");
        System.out.println("Data tidak ditemukan!");
        delay(3);
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            String input = "";
            cls();
            System.out.println("           Data Warga");
            System.out.println("==================================");
            System.out.println("        1. Tambah Data ");
            System.out.println("        2. Tampilkan Data");
            System.out.println("        3. Ubah Data");
            System.out.println("        4. Hapus Data");
            System.out.println("        5. Keluar");
            System.out.println("==================================");
            System.out.print("Masukkan Pilihan : ");
            input = sc();
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                input = "";
                inputSalah();
                continue;
            }
            if (Integer.parseInt(input) < 1 || Integer.parseInt(input) > 5) {
                inputSalah();
                continue;
            }
            System.out.println("input :" + input);
            if (Integer.parseInt(input) == 1) { // input =="1"
                tambahWarga();
            } else if (Integer.parseInt(input) == 2) {
                LihatWarga();
                delay(3);
            } else if (Integer.parseInt(input) == 3) {
                ubahData();
            } else if (Integer.parseInt(input) == 4) {
                hapusData();
            } else if (Integer.parseInt(input) == 5) {
                System.exit(0);
            }

        }
    }
}
