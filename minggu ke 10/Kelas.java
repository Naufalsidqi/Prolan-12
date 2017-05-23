/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Iscariot
 */
public class Kelas implements Sekolah {

    @Override
    public void Nama(String nama) {
        System.out.println("Siswa");   
    }

    @Override
    public void Nis(String Nis) {
        System.out.println("nis");   
    }

    @Override
    public void Belajar() {
        System.out.println("belajar"); 
    }

    @Override
    public void Tugas() {
        System.out.println("tugas");  
    }

    @Override
    public void Ujian() {
        System.out.println("ujian");   
    }
    
}
