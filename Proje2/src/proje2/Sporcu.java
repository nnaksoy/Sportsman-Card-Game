
package proje2;

public abstract class Sporcu {

    String sporcuIsim;
    String sporcuTakim;
    String resimBilgisi;

    public Sporcu() {
        super();
    }

    public Sporcu(String sporcuIsim, String sporcuTakim) {
        super();
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public String getResimBilgisi() {
        return resimBilgisi;
    }

    public abstract void sporcuPuaniGoster();

}
