package sk.janvanca.ObceVolby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import sk.janvanca.ObceVolby.domain.KandidatiStarostovia2006;
import sk.janvanca.ObceVolby.domain.QKandidatiStarostovia2006;

@Repository
public interface KandidatiStarostovia2006Repository extends JpaRepository<KandidatiStarostovia2006, Integer>, QuerydslPredicateExecutor<KandidatiStarostovia2006> {

    default Iterable<KandidatiStarostovia2006> findByName(String name) {
        return findAll(QKandidatiStarostovia2006.kandidatiStarostovia2006.meno.eq(name));
    }
    default Iterable<KandidatiStarostovia2006> findByGender(Character  gender) {
        return findAll(QKandidatiStarostovia2006.kandidatiStarostovia2006.pohlavie.eq(gender));
    }

    default Iterable<KandidatiStarostovia2006> findByNazovObce(String nazovObce) {
        return findAll(QKandidatiStarostovia2006.kandidatiStarostovia2006.nazovObce.eq(nazovObce));
    }
}
