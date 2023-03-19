package sk.janvanca.ObceVolby.service.impl;

import org.springframework.stereotype.Service;
import sk.janvanca.ObceVolby.domain.KandidatiStarostovia2006;
import sk.janvanca.ObceVolby.dto.KandidatiStarostovia2006Dto;
import sk.janvanca.ObceVolby.dto.MapperUtils;
import sk.janvanca.ObceVolby.dto.NamesDto;
import sk.janvanca.ObceVolby.repository.KandidatiStarostovia2006Repository;
import sk.janvanca.ObceVolby.service.KandidatiStarostovia2006Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class KandidatiStarostovia2006ServiceImpl implements KandidatiStarostovia2006Service {


    private final MapperUtils mapperUtils;
    private final KandidatiStarostovia2006Repository kandidatiStarostovia2006Repository;

    public KandidatiStarostovia2006ServiceImpl(MapperUtils mapperUtils, KandidatiStarostovia2006Repository kandidatiStarostovia2006Repository) {
        this.mapperUtils = mapperUtils;
        this.kandidatiStarostovia2006Repository = kandidatiStarostovia2006Repository;
    }

    @Override
    public KandidatiStarostovia2006Dto getKandidatNaStarostu2006(Integer id) {
        if (id != null) {
            Optional<KandidatiStarostovia2006> kandidatNaStarostu = kandidatiStarostovia2006Repository.findById(id);
            if (kandidatNaStarostu.isPresent()) {
                return mapperUtils.kandidatiStarostovia2006ToKandidatiStarostovia2006Dto(kandidatNaStarostu.get());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public List<KandidatiStarostovia2006Dto> getKandidatiStarostovia2006() {
        List<KandidatiStarostovia2006> listKandidati = kandidatiStarostovia2006Repository.findAll();
        if (!listKandidati.isEmpty()) {
            return listKandidati
                    .stream()
                    .map(mapperUtils::kandidatiStarostovia2006ToKandidatiStarostovia2006Dto)
                    .collect(Collectors.toList());
        } else {
            return null;
        }
    }

    @Override
    public void deleteKandidataNaStarostu2006(Integer id) {

    }

    @Override
    public void updateKandidataNaStarostu2006(Integer id, NamesDto namesDto) {

    }

    @Override
    public void createKandidataNaStarostu2006(KandidatiStarostovia2006Dto namesDto) {

    }

    @Override
    public List<KandidatiStarostovia2006Dto> getNameByKandidatNaStarostuName(String name) {
        return null;
    }

    @Override
    public List<KandidatiStarostovia2006Dto> getGenderByKandidatNaStarostuGender(Character gender) {
        return null;
    }

    @Override
    public List<KandidatiStarostovia2006Dto> getKandidatiNaStarostov2006ByNazovObce(String nazovObce) {
        return null;
    }
}
