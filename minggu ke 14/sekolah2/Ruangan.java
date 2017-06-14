package sekolah2;

/**
 *
 * @author Iscariot
 */
class Ruangan<T>{
    private T nik;

    public Ruangan(T nik) {

        this.nik = nik;

    }

    public void setNik(T nik) {
        this.nik = nik;
    }

    public T getNik() {
        return nik;
    }

    public void getType() {
        System.out.println("Tipe awalnya " + nik.getClass().getName());
    }
}