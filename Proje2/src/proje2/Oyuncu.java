
package proje2;

import java.util.ArrayList;

public abstract class Oyuncu {

    String oyuncuID;
    String oyuncuAdi;
    int Skor;
    ArrayList<Sporcu> kartListesi = new ArrayList<Sporcu>();

    public Oyuncu(String oyuncuID,String oyuncuAdi,int Skor) {
        super();
        this.oyuncuID=oyuncuID;

        this.oyuncuAdi = oyuncuAdi;
        this.Skor = 0;

    }

    public Oyuncu() {

    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int skor) {
        Skor = skor;
    }

    public abstract int SkorGoster();

    public abstract void kartSec();

}
