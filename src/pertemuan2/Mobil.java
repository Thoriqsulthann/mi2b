/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author USER
 */
public class Mobil {
    int tahunPembuatan;
    String namaModel;
    public Mobil(int tahun, String nama){
        tahunPembuatan = tahun;
        namaModel = nama;
    }
    public static void main(String [] args){
        Mobil m = new Mobil(2020, "Avanza");
        System.out.println("Nama Mobil : "+m.namaModel+
                "\n"+"Tahun Pembbuatan : "+m.tahunPembuatan);
    }
}
