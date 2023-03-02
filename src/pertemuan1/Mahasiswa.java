/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
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
        
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama="maya";
        mhs2.nobp ="2101092000";
        mhs2.kelas="B";
        mhs2.prodi="Manajemen Informatika";
        mhs2.jurusan="Teknologi Informasi";
        
        System.out.println("Nama : " +mhs2.nama+ "\n"
                           + "No BP : "+mhs2.nobp+"\n"
                           + "Jurusan : "+mhs2.jurusan+"\n"
                           + "Prodi : "+mhs2.prodi+"\n"
                           + "Kelas : "+mhs2.kelas+"\n");
     
    }
}
