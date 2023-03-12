/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class KelasInput {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama");
        Person p = new Person();
        p.setNama(sc.nextLine());
        System.out.println("Nama saya adalah : "+p.getNama());
    }
}
