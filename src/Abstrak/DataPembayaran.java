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
public class DataPembayaran extends Pembayaran {
    private int spp;
    int bulan;
    int total;
    
    @Override
    int hitung(){
        return hitung(bulan);
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