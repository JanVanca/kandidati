package sk.janvanca.ObceVolby.domain;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

@Entity
@Table(name = "kandidati_starostovia_2014")
public class KandidatiStarostovia2014 {

    @Nullable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Nullable
    @Column(name = "kod_obvodu")
    private Integer kodObvodu;

    @Nullable
    @Column(name = "nazov_obvodu")
    private String nazovObvodu;

    @Nullable
    @Column(name = "kod_obce")
    private Integer kodObce;

    @NonNull
    @Column(name = "nazov_obce")
    private String nazovObce;

    @NonNull
    @Column(name = "meno")
    private String meno;

    @NonNull
    @Column(name = "priezvisko")
    private String priezvisko;

    @Nullable
    @Column(name = "pohlavie")
    private Character pohlavie;

    @Nullable
    @Column(name = "politicky_subjekt")
    private String politickySubjekt;

    public KandidatiStarostovia2014() {
    }

    public KandidatiStarostovia2014(@Nullable Integer kodObvodu, @Nullable String nazovObvodu, @Nullable Integer kodObce, @NonNull String nazovObce, @NonNull String meno, @NonNull String priezvisko, @Nullable Character pohlavie, @Nullable String politickySubjekt) {
        this.kodObvodu = kodObvodu;
        this.nazovObvodu = nazovObvodu;
        this.kodObce = kodObce;
        this.nazovObce = nazovObce;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.politickySubjekt = politickySubjekt;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    @Nullable
    public Integer getKodObvodu() {
        return kodObvodu;
    }

    public void setKodObvodu(@Nullable Integer kodObvodu) {
        this.kodObvodu = kodObvodu;
    }

    @Nullable
    public String getNazovObvodu() {
        return nazovObvodu;
    }

    public void setNazovObvodu(@Nullable String nazovObvodu) {
        this.nazovObvodu = nazovObvodu;
    }

    @Nullable
    public Integer getKodObce() {
        return kodObce;
    }

    public void setKodObce(@Nullable Integer kodObce) {
        this.kodObce = kodObce;
    }

    @NonNull
    public String getNazovObce() {
        return nazovObce;
    }

    public void setNazovObce(@NonNull String nazovObce) {
        this.nazovObce = nazovObce;
    }

    @NonNull
    public String getMeno() {
        return meno;
    }

    public void setMeno(@NonNull String meno) {
        this.meno = meno;
    }

    @NonNull
    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(@NonNull String priezvisko) {
        this.priezvisko = priezvisko;
    }

    @Nullable
    public Character getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(@Nullable Character pohlavie) {
        this.pohlavie = pohlavie;
    }

    @Nullable
    public String getPolitickySubjekt() {
        return politickySubjekt;
    }

    public void setPolitickySubjekt(@Nullable String politickySubjekt) {
        this.politickySubjekt = politickySubjekt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KandidatiStarostovia2014 that = (KandidatiStarostovia2014) o;
        return Objects.equals(id, that.id) && Objects.equals(kodObvodu, that.kodObvodu) && Objects.equals(nazovObvodu, that.nazovObvodu) && Objects.equals(kodObce, that.kodObce) && nazovObce.equals(that.nazovObce) && meno.equals(that.meno) && priezvisko.equals(that.priezvisko) && Objects.equals(pohlavie, that.pohlavie) && Objects.equals(politickySubjekt, that.politickySubjekt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kodObvodu, nazovObvodu, kodObce, nazovObce, meno, priezvisko, pohlavie, politickySubjekt);
    }

    @Override
    public String toString() {
        return "KandidatiStarostovia2014{" +
                "id=" + id +
                ", kodObvodu=" + kodObvodu +
                ", nazovObvodu='" + nazovObvodu + '\'' +
                ", kodObce=" + kodObce +
                ", nazovObce='" + nazovObce + '\'' +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                ", politickySubjekt='" + politickySubjekt + '\'' +
                '}';
    }
}
