/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

import TugasPrak.*;

/**
 *
 * @author LENOVO
 */
public class Pembayaran extends Abstrak_PembayaranSpp{
    private String jurusan, alamat;
    String nis;
    String namasiswa;
    String kelas;
    String jeniskelamin;

    public Pembayaran(String nis, String namasiswa, String kelas, String jurusan, String jeniskelamin, String alamat) {
        this.nis = nis;
        this.namasiswa = namasiswa;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
    }

    public String getNis() {
        return nis;
    }
    public void setNis(String nis) {
        this.nis = nis;
    }
    void setjudul(){
        System.out.println("KARTU SPP SISWA");
    }
    void datanis(String NIS){
        this.nis = NIS;
    } 
    void datasiswa(String NamaSiswa){
        this.namasiswa = NamaSiswa;
    }
    void datakelas(String Kelas){
        this.kelas = Kelas;
    } 
    void datajurusan(String Jurusan){
        this.jurusan = Jurusan;
    }
    void datajenis(String JenisKelamin){
        this.jeniskelamin = JenisKelamin;
    }
    void dataalamat(String Alamat){
        this.alamat = Alamat;
    }

    String cetaknis(){
        return nis;
    }
    String cetaknamasiswa(){
        return namasiswa;
    }
    String cetakkelas(){
        return kelas;
    }
    String cetakjurusan(){
        return jurusan;
    }
    String cetakjenis(){
        return jeniskelamin;
    }
    String cetakalamat(){
        return alamat;
    }
    
    int hitung(){
        return 0;
    }
    int hitung(int bulan){
        return (bulan * 150000);
    }

    public Pembayaran(){
        this.nis = "2218077";
        this.namasiswa = "Deva Sandhya";
        this.kelas = "B"; 
        this.jurusan = "IPA";
        this.jeniskelamin = "Laki-Laki";
        this.alamat = "Lombok-Mataram";
    }
    @Override
    public String Keterangan(){
        return "SUDAH LUNAS";
    }
    public String Keterangan(String nis){
        return "BELUM LUNAS";
    }
    boolean cek(String nis){
        if(nis.equals(getNis())){
            Keterangan();
            return true;
        }
    Keterangan(nis);
    return false;
  }
}