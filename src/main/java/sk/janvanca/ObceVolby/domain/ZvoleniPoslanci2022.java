package sk.janvanca.ObceVolby.domain;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

@Entity
@Table(name = "zvoleni_poslanci_2022")
public class ZvoleniPoslanci2022 {

    @Nullable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Nullable
    @Column(name = "kod_kraja")
    private Integer kodKraja;

    @Nullable
    @Column(name = "nazov_kraja")
    private String nazovKraja;

    @Nullable
    @Column(name = "kod_uzemneho_obvodu")
    private Integer kodUzemnehoObvodu;

    @Nullable
    @Column(name = "nazov_uzemneho_obvodu")
    private String nazovUzemnehoObvodu;

    @Nullable
    @Column(name = "kod_okresu")
    private Integer kodOkresu;

    @Nullable
    @Column(name = "nazov_okresu")
    private String nazovOkresu;

    @Nullable
    @Column(name = "kod_obce")
    private Integer kodObce;

    @NonNull
    @Column(name = "nazov_obce")
    private String nazovObce;

    @Nullable
    @Column(name = "volebny_obvod_v_obci")
    private Integer volebnyObvodVObci;

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

    @Nullable
    @Column(name = "pocet_platnych_hlasov")
    private Integer pocetPlatnychHlasov;

    public ZvoleniPoslanci2022() {
    }

    public ZvoleniPoslanci2022(@Nullable Integer kodKraja, @Nullable String nazovKraja, @Nullable Integer kodUzemnehoObvodu, @Nullable String nazovUzemnehoObvodu, @Nullable Integer kodOkresu, @Nullable String nazovOkresu, @Nullable Integer kodObce, @NonNull String nazovObce, @Nullable Integer volebnyObvodVObci, @NonNull String meno, @NonNull String priezvisko, @Nullable Character pohlavie, @Nullable String politickySubjekt, @Nullable Integer pocetPlatnychHlasov) {
        this.kodKraja = kodKraja;
        this.nazovKraja = nazovKraja;
        this.kodUzemnehoObvodu = kodUzemnehoObvodu;
        this.nazovUzemnehoObvodu = nazovUzemnehoObvodu;
        this.kodOkresu = kodOkresu;
        this.nazovOkresu = nazovOkresu;
        this.kodObce = kodObce;
        this.nazovObce = nazovObce;
        this.volebnyObvodVObci = volebnyObvodVObci;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.politickySubjekt = politickySubjekt;
        this.pocetPlatnychHlasov = pocetPlatnychHlasov;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    @Nullable
    public Integer getKodKraja() {
        return kodKraja;
    }

    public void setKodKraja(@Nullable Integer kodKraja) {
        this.kodKraja = kodKraja;
    }

    @Nullable
    public String getNazovKraja() {
        return nazovKraja;
    }

    public void setNazovKraja(@Nullable String nazovKraja) {
        this.nazovKraja = nazovKraja;
    }

    @Nullable
    public Integer getKodUzemnehoObvodu() {
        return kodUzemnehoObvodu;
    }

    public void setKodUzemnehoObvodu(@Nullable Integer kodUzemnehoObvodu) {
        this.kodUzemnehoObvodu = kodUzemnehoObvodu;
    }

    @Nullable
    public String getNazovUzemnehoObvodu() {
        return nazovUzemnehoObvodu;
    }

    public void setNazovUzemnehoObvodu(@Nullable String nazovUzemnehoObvodu) {
        this.nazovUzemnehoObvodu = nazovUzemnehoObvodu;
    }

    @Nullable
    public Integer getKodOkresu() {
        return kodOkresu;
    }

    public void setKodOkresu(@Nullable Integer kodOkresu) {
        this.kodOkresu = kodOkresu;
    }

    @Nullable
    public String getNazovOkresu() {
        return nazovOkresu;
    }

    public void setNazovOkresu(@Nullable String nazovOkresu) {
        this.nazovOkresu = nazovOkresu;
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

    @Nullable
    public Integer getVolebnyObvodVObci() {
        return volebnyObvodVObci;
    }

    public void setVolebnyObvodVObci(@Nullable Integer volebnyObvodVObci) {
        this.volebnyObvodVObci = volebnyObvodVObci;
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

    @Nullable
    public Integer getPocetPlatnychHlasov() {
        return pocetPlatnychHlasov;
    }

    public void setPocetPlatnychHlasov(@Nullable Integer pocetPlatnychHlasov) {
        this.pocetPlatnychHlasov = pocetPlatnychHlasov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZvoleniPoslanci2022 that = (ZvoleniPoslanci2022) o;
        return Objects.equals(id, that.id) && Objects.equals(kodKraja, that.kodKraja) && Objects.equals(nazovKraja, that.nazovKraja) && Objects.equals(kodUzemnehoObvodu, that.kodUzemnehoObvodu) && Objects.equals(nazovUzemnehoObvodu, that.nazovUzemnehoObvodu) && Objects.equals(kodOkresu, that.kodOkresu) && Objects.equals(nazovOkresu, that.nazovOkresu) && Objects.equals(kodObce, that.kodObce) && nazovObce.equals(that.nazovObce) && Objects.equals(volebnyObvodVObci, that.volebnyObvodVObci) && meno.equals(that.meno) && priezvisko.equals(that.priezvisko) && Objects.equals(pohlavie, that.pohlavie) && Objects.equals(politickySubjekt, that.politickySubjekt) && Objects.equals(pocetPlatnychHlasov, that.pocetPlatnychHlasov);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kodKraja, nazovKraja, kodUzemnehoObvodu, nazovUzemnehoObvodu, kodOkresu, nazovOkresu, kodObce, nazovObce, volebnyObvodVObci, meno, priezvisko, pohlavie, politickySubjekt, pocetPlatnychHlasov);
    }

    @Override
    public String toString() {
        return "ZvoleniPoslanci2022{" +
                "id=" + id +
                ", kodKraja=" + kodKraja +
                ", nazovKraja='" + nazovKraja + '\'' +
                ", kodUzemnehoObvodu=" + kodUzemnehoObvodu +
                ", nazovUzemnehoObvodu='" + nazovUzemnehoObvodu + '\'' +
                ", kodOkresu=" + kodOkresu +
                ", nazovOkresu='" + nazovOkresu + '\'' +
                ", kodObce=" + kodObce +
                ", nazovObce='" + nazovObce + '\'' +
                ", volebnyObvodVObci=" + volebnyObvodVObci +
                ", meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                ", politickySubjekt='" + politickySubjekt + '\'' +
                ", pocetPlatnychHlasov=" + pocetPlatnychHlasov +
                '}';
    }
}
