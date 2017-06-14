package sekolah1;

/**
 *
 * @author Iscariot
 */
public abstract class sekolah1{
    private String nama;
    private String kode;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    /*
    method abstrack
    */
    
    public abstract void belajar();
    public abstract void tugas();
    public abstract void ujian();
    public abstract void  pulang();
    
    }