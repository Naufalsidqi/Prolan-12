package sekolah1;

/**
 *
 * @author Iscariot
 */
import java.util.Scanner;

public class sekolahmain {

    public static void main(String args[]) {
        String nama;
        String kode;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama :");
        nama = input.next();

        System.out.println("Masukan Kode :");
        kode = input.next();

        Ruangan<Integer> p = new Ruangan<>(987654321);
        int y = p.getNik();
        System.out.println("Tipe yang digunakan Integer : " + y);

        System.out.println("");
        System.out.println("-----------");
        System.out.println("");

        Ruangan<String> p2 = new Ruangan<>("987654321");
        String z = p2.getNik();
        System.out.println("Tipe yang digunakan String : " + z);

        System.out.println("");
        System.out.println("##########################################");
        System.out.println("");

        /*
         CASE 2
         */
        Ruangan p3 = new Ruangan<>("10998812");
        String d = (String) p3.getNik();
        System.out.println("HARUS DICASTING : " + d);

    }

}