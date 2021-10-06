
package proje2;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar(String oyuncuID,String oyuncuAdi,int Skor) {
        super(oyuncuID,oyuncuAdi,Skor);

    }

    public Bilgisayar() {

    }

    @Override
    public int SkorGoster() {
        return Skor;
    }

    @Override
    public void kartSec() {

    }

}
