package sk.janvanca.ObceVolby.service;

import sk.janvanca.ObceVolby.dto.NamesDto;

import java.util.List;

public interface NamesService {

    NamesDto getName(Integer id);
    List<NamesDto> getNames();
    void deleteNames(Integer id);
    void updateNames(Integer id, NamesDto namesDto);
    void createName(NamesDto namesDto);
    List<NamesDto> getNamesByName(String name);
    List<NamesDto> getNamesByGender(Character gender);



}
