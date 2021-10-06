
package proje2;

public class Futbolcu extends Sporcu {

    public String getResimBilgisi() {
        return resimBilgisi;
    }

    public void setResimBilgisi(String resimBilgisi) {
        this.resimBilgisi = resimBilgisi;
    }
    private String futbolcuAdi;
    private String futbolcuTakim;
    String resimBilgisi;
    int Penalti;
    int SerbestVurus;
    int KaleciKarsiKarsiya;
    boolean kartKullanildiMi = false;

    public Futbolcu(String futbolcuAdi, String futbolcuTakim) {
        super(futbolcuAdi, futbolcuTakim);
    }

    public Futbolcu() {

    }

    @Override
    public void sporcuPuaniGoster() {
        // TODO Auto-generated method stub

    }

    public int getPenalti() {
        return Penalti;
    }

    public void setPenalti(int Penalti) {
        this.Penalti = Penalti;
    }

    public int getSerbestVurus() {
        return SerbestVurus;
    }

    public void setSerbestVurus(int SerbestVurus) {
        this.SerbestVurus = SerbestVurus;
    }

    public int getKaleciKarsiKarsiya() {
        return KaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int KaleciKarsiKarsiya) {
        this.KaleciKarsiKarsiya = KaleciKarsiKarsiya;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean KartKullanildiMi) {
        this.kartKullanildiMi = KartKullanildiMi;
    }

}
