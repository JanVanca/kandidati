package sk.janvanca.ObceVolby.dto;

import java.util.Objects;

public class KandidatiStarostovia2006Dto {

    private Integer id;
    private Integer kodObvodu;
    private String nazovObvodu;
    private String nazovObce;
    private String meno;
    private String priezvisko;
    private Character pohlavie;
    private Integer pocetHlasov;
    private String politickySubjekt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKodObvodu() {
        return kodObvodu;
    }

    public void setKodObvodu(Integer kodObvodu) {
        this.kodObvodu = kodObvodu;
    }

    public String getNazovObvodu() {
        return nazovObvodu;
    }

    public void setNazovObvodu(String nazovObvodu) {
        this.nazovObvodu = nazovObvodu;
    }

    public String getNazovObce() {
        return nazovObce;
    }

    public void setNazovObce(String nazovObce) {
        this.nazovObce = nazovObce;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public Character getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(Character pohlavie) {
        this.pohlavie = pohlavie;
    }

    public Integer getPocetHlasov() {
        return pocetHlasov;
    }

    public void setPocetHlasov(Integer pocetHlasov) {
        this.pocetHlasov = pocetHlasov;
    }

    public String getPolitickySubjekt() {
        return politickySubjekt;
    }

    public void setPolitickySubjekt(String politickySubjekt) {
        this.politickySubjekt = politickySubjekt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KandidatiStarostovia2006Dto that = (KandidatiStarostovia2006Dto) o;
        return Objects.equals(id, that.id) && Objects.equals(kodObvodu, that.kodObvodu) && Objects.equals(nazovObvodu, that.nazovObvodu) && Objects.equals(nazovObce, that.nazovObce) && Objects.equals(meno, that.meno) && Objects.equals(priezvisko, that.priezvisko) && Objects.equals(pohlavie, that.pohlavie) && Objects.equals(pocetHlasov, that.pocetHlasov) && Objects.equals(politickySubjekt, that.politickySubjekt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kodObvodu, nazovObvodu, nazovObce, meno, priezvisko, pohlavie, pocetHlasov, politickySubjekt);
    }

    @Override
    public String toString() {
        return "KandidatiStarostovia2006Dto{" +
                "id=" + id +
                ", kodObvodu=" + kodObvodu +
                ", nazovObvodu='" + nazovObvodu + '\'' +
                ", nazovObce='" + nazovObce + '\'' +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                ", pocetHlasov=" + pocetHlasov +
                ", politickySubjekt='" + politickySubjekt + '\'' +
                '}';
    }
}
