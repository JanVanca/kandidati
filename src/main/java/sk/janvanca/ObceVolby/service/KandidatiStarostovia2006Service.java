package sk.janvanca.ObceVolby.service;

import sk.janvanca.ObceVolby.dto.NamesDto;
import sk.janvanca.ObceVolby.dto.KandidatiStarostovia2006Dto;

import java.util.List;

public interface KandidatiStarostovia2006Service {

    KandidatiStarostovia2006Dto getKandidatNaStarostu2006(Integer id);
    List<KandidatiStarostovia2006Dto> getKandidatiStarostovia2006();
    void deleteKandidataNaStarostu2006(Integer id);
    void updateKandidataNaStarostu2006(Integer id, NamesDto namesDto);
    void createKandidataNaStarostu2006(KandidatiStarostovia2006Dto namesDto);
    List<KandidatiStarostovia2006Dto> getNameByKandidatNaStarostuName(String name);
    List<KandidatiStarostovia2006Dto> getGenderByKandidatNaStarostuGender(Character gender);
    List<KandidatiStarostovia2006Dto> getKandidatiNaStarostov2006ByNazovObce(String nazovObce);

}
