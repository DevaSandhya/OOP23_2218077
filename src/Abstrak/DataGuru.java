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
public class DataGuru extends Pembayaran {
    private String jabatan;
    String nip;
    String namaguru;
    String mapel;

    void setjudul() {
        System.out.println("DATA GURU");
    }
    void datanip(String NIP) {
        this.nip = NIP;
    }
    void datanama(String NamaGuru) {
        this.namaguru = NamaGuru;
    }
    void datajabatan(String Jabatan) {
        this.jabatan = Jabatan;
    }
    void datamapel(String Mapel) {
        this.mapel = Mapel;
    }
    
    // Overloading method datanip dengan parameter int
    void datanip(int NIP) {
        this.nip = String.valueOf(NIP);
    }
    // Overloading method datanama dengan parameter int
    void datanama(int NamaGuru) {
        this.namaguru = String.valueOf(NamaGuru);
    }
    // Overloading method datajabatan dengan parameter int
    void datajabatan(int Jabatan) {
        this.jabatan = String.valueOf(Jabatan);
    }
    // Overloading method datamapel dengan parameter int
    void datamapel(int Mapel) {
        this.mapel = String.valueOf(Mapel);
    }

    String cetaknip() {
        return nip;
    }
    String cetaknama() {
        return namaguru;
    }
    String cetakjabatan() {
        return jabatan;
    }
    String cetakmapel() {
        return mapel;
    }
    @Override
    public String Keterangan(){
        return "BELUM LUNAS";
    }
    /**
     *
     * @param nis
     * @return
     */
    @Override
    public String Keterangan(String nis){
        return "LUNAS";
    }
}