public class Naufal extends Mahasiswa {

    @Override
    protected void kuliah() {
        System.out.println("Kuliah harus rajin");  
    }

    @Override
    protected void lulus() {
        System.out.println("lulus harus tepat waktu ");
    }

    @Override
    protected void tidakLulus() {
        System.out.println("Tidak lulus maka pindah kampus ");
    }
    
}