
package proje2;

public class Kullanici extends Oyuncu {

    public Kullanici(String oyuncuID,String oyuncuAdi,int Skor) {
        super(oyuncuID,oyuncuAdi,Skor);
     }

    public Kullanici() {

    }

    @Override
    public int SkorGoster() {
        return Skor;
    }

    @Override
    public void kartSec() {
        
    }

}
