public class Karyawan {
    int nip;
   String nama;
    String tgl_lahir;
    String jk;
    private int tglmsk; //enkapsulasi
    int gaji = 2000000;
    String alamat;


    //setter getter
    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public int getTglmsk() {
        return tglmsk;
    }

    public void setTglmsk(int tglmsk) {
        this.tglmsk = tglmsk;
    }


}
