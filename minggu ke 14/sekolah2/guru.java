package sekolah2;

import sekolah1.sekolah1;

/**
 *
 * @author Iscariot
 */
public class guru extends sekolah1 {
    public guru(String nama,String kode){
        setNama(nama);
        setKode(kode);
        
        System.out.println("Nama :" +getNama());
        System.out.println("Kode :" +getKode());
        
    }

    public guru() {
    }

    @Override
    public void belajar() {
        System.out.println("siswa telah belajar");
    }

    @Override
    public void tugas() {
        System.out.println("tugas berhasil di kerjakan");
    }

    @Override
    public void ujian() {
        System.out.println("siswa telah mengikuti ujian ");
    }

    @Override
    public void pulang() {
        System.out.println("semua siswa pulang");    }
    
}