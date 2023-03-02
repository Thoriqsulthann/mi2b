/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author USER
 */
public class Pendaftaran {
    public static void main (String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama="Thoriq";
        mhs.nobp ="2101092070";
        mhs.kelas="B";
        mhs.prodi="Manajemen Informatika";
        mhs.jurusan="Teknologi Informasi";
        
        System.out.println("Nama : " +mhs.nama+ "\n"
                           + "No BP : "+mhs.nobp+"\n"
                           + "Jurusan : "+mhs.jurusan+"\n"
                           + "Prodi : "+mhs.prodi+"\n"
                           + "Kelas : "+mhs.kelas+"\n");
    }
}
