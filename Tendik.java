//inheritance
import java.util.Scanner;
public class Tendik extends Karyawan{
    int jamlemburtendik;
    int perjamlembur = 50000;
    int gajitendik;

    Scanner in = new Scanner(System.in);

    public void gajilemburtendik(){
        System.out.println("Berapa jam Lembur : ");
        jamlemburtendik = in.nextInt();
        gajitendik = (perjamlembur*jamlemburtendik)+gaji;
        System.out.println("Gaji Total Tendik Lembur : " +gajitendik);
    }

    public void gajitotaltendik(){
        System.out.println("Gaji Total Tendik : " +gaji);
    }

    //overloading
    String biodata(String nip, String tgl_lahir){
        return "NIP Tendik : " +nip+ "Tanggal Lahir Tendik : " +tgl_lahir;
    }

    String biodata(String jk, int tglmsk){
        return "Jenis Kelamin Tendik : " +jk+ "Tanggal Masuk Tendik Pertama Kali : " +tglmsk;
    }

}
