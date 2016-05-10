package roisah13111043hitunganminggu;

public class Minggu {

    int mngu, hr, jm, mnt, dtk;

    public Minggu() {
    }

    public Minggu(int mngu, int hr, int jm, int mnt, int dtk) {
        this.mngu = mngu;
        this.hr = hr;
        this.jm = jm;
        this.mnt = mnt;
        this.dtk = dtk;
    }

    public int getMngu() {
        return mngu;
    }

    public void setMngu(int mngu) {
        this.mngu = mngu;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getJm() {
        return jm;
    }

    public void setJm(int jm) {
        this.jm = jm;
    }

    public int getMnt() {
        return mnt;
    }

    public void setMnt(int mnt) {
        this.mnt = mnt;
    }

    public int getDtk() {
        return dtk;
    }

    public void setDtk(int dtk) {
        this.dtk = dtk;
    }

    int convertMingguToHari(int Minggu) {
        int Hari;
        Hari = Minggu * 7;
        return Hari;

    }

    int convertMingguToJam(int Minggu) {
        int Jam;
        Jam = Minggu * 168 ;
        return Jam;
    }

    int convertMingguToMenit(int Minggu) {
        int Menit;
        Menit = Minggu * 10080;
        return Menit;
    }
    int convertMingguToDetik(int Minggu){
        int Detik;
        Detik = Minggu * 604800;
        return Detik;
    }
    
    int converHariToJam(int Minggu){
        int Jam;
        Jam = Minggu * 24;
        return Jam;
    }
    
    int convertHariToMenit (int Minggu){
        int Menit;
        Menit = Minggu * 1440;
        return Menit;
    }
}
