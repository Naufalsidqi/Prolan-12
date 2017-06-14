package sekolah1;

/**
 *
 * @author Iscariot
 */
public class siswa extends sekolah1{
    public Kamar(String nama, String kode){
        setNama(nama);
        setKode(kode);
        System.out.println("Nama :" +getNama());
        System.out.println("Kode :" +getKode());
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
        System.out.println("siswa telah mengikuti ujian");    
    }

    @Override
    public void pulang() {
        System.out.println("semua siswa pulang");    }
    
}