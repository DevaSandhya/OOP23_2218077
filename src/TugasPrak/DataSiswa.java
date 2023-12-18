/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak;

/**
 *
 * @author LENOVO
 */
public class DataSiswa {
    public static void main(String[] args) {
    Pembayaran DataS;
    DataS = new Pembayaran();
    DataS.setjudul();
    System.out.println("------------------------------------");
    System.out.println("NIS : "+ DataS.cetaknis()); 
    System.out.println("Nama Siswa : "+ DataS.cetaknamasiswa()); 
    System.out.println("Kelas : "+ DataS.cetakkelas()); 
    System.out.println("Jurusan : "+ DataS.cetakjurusan()); 
    System.out.println("Jenis Kelamin : "+ DataS.cetakjenis()); 
    System.out.println("Alamat : "+ DataS.cetakalamat()); 
    }
}