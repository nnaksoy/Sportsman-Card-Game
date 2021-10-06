
package proje2;

public class Basketbolcu extends Sporcu {

    private String basketbolcuAdi;
    private String basketbolcuTakim;
    boolean kartKullanildiMi = false;
    private int ikilikAtis, uclukAtis, SerbestAtis;
    String resimBilgisi;

    public String getResimBilgisi() {
        return resimBilgisi;
    }

    public void setResimBilgisi(String resimBilgisi) {
        this.resimBilgisi = resimBilgisi;
    }

    public Basketbolcu(String basketbolcuAdi, String basketbolcuTakim) {
        super(basketbolcuAdi, basketbolcuTakim);

    }

    public Basketbolcu() {
        super();
    }

    public int getIkilikAtis() {
        return ikilikAtis;
    }

    public void setIkilikAtis(int ikilikAtis) {
        this.ikilikAtis = ikilikAtis;
    }

    public int getUclukAtis() {
        return uclukAtis;
    }

    public void setUclukAtis(int uclukAtis) {
        this.uclukAtis = uclukAtis;
    }

    public int getSerbestAtis() {
        return SerbestAtis;
    }

    public void setSerbestAtis(int SerbestAtis) {
        this.SerbestAtis = SerbestAtis;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

    @Override
    public void sporcuPuaniGoster() {
        // TODO Auto-generated method stub

    }
}
