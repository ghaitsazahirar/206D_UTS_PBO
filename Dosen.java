//inheritance
import java.util.Scanner;
public class Dosen extends Karyawan{
   int sksdosen;
   int gajipersks = 100000;
   int mingguan;
   int nidn;
   int gajidosen;
   String jurusan;

   Scanner in = new Scanner(System.in);

   public void gajidosenlembur(){
      System.out.println("Berapa sks tambahan lembur : ");
      sksdosen = in.nextInt();
      gajidosen = (sksdosen*gajipersks)+gaji;
      System.out.println("Gaji Total Dosen Lembur : " +gajidosen);
   }

   public void gajitotaldosen(){
      System.out.println("Gaji Dosen Total : " +gaji);
   }

   String biodata(String nip, String nidn, String jurusan){
      return "NIP Dosen : " +nip+ "NIDN Dosen : " +nidn+ "Jurusan Dosen : " +jurusan;
   }
   String biodata(int tglmsk, String tgl_lahir,  String jk){
      return "Tanggal Lahir Dosen : " +tgl_lahir+ "Jenis Kelamin : " +jk+ "Tanggal Masuk : " +tglmsk;
   }

}
