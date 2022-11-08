import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nama;
        String namatendik;
        String alamat;
        char lembur;
        int pil;
        //dosen
        Karyawan kry1 = new Karyawan();
        Dosen dsn = new Dosen();
        int sks = dsn.sksdosen;
        int minggu = dsn.mingguan;
        Tendik tendik = new Tendik();
        int jamlembur = tendik.jamlemburtendik;
        int perjam = tendik.perjamlembur;
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih Salah Satu : ");
        System.out.println("1. Dosen");
        System.out.println("2. Tendik");
        System.out.println("Input pilihan dengan angka : ");
        pil = in.nextInt();
        if (pil == 1){
            Scanner input = new Scanner(System.in);
            System.out.println("Nama Dosen : ");
            nama = input.nextLine();
            System.out.println("Alamat Dosen : ");
            alamat = input.nextLine();
            System.out.println("Base Salary : " +kry1.gaji);
            System.out.println("Apakah Lembur? : ");
            lembur = in.next().charAt(0);
            if(lembur=='Y' || lembur=='y'){
                dsn.gajidosenlembur();
            } else if (lembur == 'N' || lembur =='n') {
                dsn.gajitotaldosen();
            }
            System.out.println(dsn.biodata("12345\n", "2100018206\n", "Informatika"));
            System.out.println(dsn.biodata(10032020, "01 Januari 1998\n", "Laki-Laki\n"));
        } else if (pil == 2) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nama Tendik : ");
            namatendik = input.nextLine();
            System.out.println("Alamat Tendik : ");
            alamat = input.nextLine();
            System.out.println("Base Salary : " +tendik.gaji);
            System.out.println("Apakah Lembur? : ");
            lembur = in.next().charAt(0);
            if (lembur == 'Y' || lembur == 'y'){
                tendik.gajilemburtendik();
            } else if (lembur == 'N' || lembur == 'n') {
                tendik.gajitotaltendik();
            }
            System.out.println(tendik.biodata("6789\n", "03 Maret 1998"));
            System.out.println(tendik.biodata("Laki-Laki\n", 30012020));
        }

    }
}