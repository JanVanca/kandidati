package sk.janvanca.ObceVolby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import sk.janvanca.ObceVolby.domain.Names;
import sk.janvanca.ObceVolby.domain.QNames;

@Repository
public interface NamesRepository extends JpaRepository<Names, Integer>, QuerydslPredicateExecutor<Names> {

    default Iterable<Names> findByName(String name) {
        return findAll(QNames.names.name.eq(name));
    }
    default Iterable<Names> findByGender(Character  gender) {
        return findAll(QNames.names.gender.eq(gender));
    }
}
