package sk.janvanca.ObceVolby.service.impl;

import org.springframework.stereotype.Service;
import sk.janvanca.ObceVolby.domain.Names;
import sk.janvanca.ObceVolby.dto.MapperUtils;
import sk.janvanca.ObceVolby.dto.NamesDto;
import sk.janvanca.ObceVolby.repository.NamesRepository;
import sk.janvanca.ObceVolby.service.NamesService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class NamesServiceImpl implements NamesService {

    private final MapperUtils mapperUtils;
    private final NamesRepository namesRepository;

    public NamesServiceImpl(MapperUtils mapperUtils, NamesRepository namesRepository) {
        this.mapperUtils = mapperUtils;
        this.namesRepository = namesRepository;
    }

    @Override
    public NamesDto getName(Integer id) {
        if (id != null) {
            Optional<Names> name = namesRepository.findById(id);
            if (name.isPresent()) {
                return mapperUtils.namesToNamesDto(name.get());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public List<NamesDto> getNames() {
        List<Names> namesList = namesRepository.findAll();
        if (!namesList.isEmpty()) {
            return namesList
                    .stream()
                    .map(mapperUtils::namesToNamesDto)
                    .collect(Collectors.toList());
        } else {
            return null;
        }
    }

    @Override
    public void deleteNames(Integer id) {
        namesRepository.deleteById(id);
    }

    @Override
    public void updateNames(Integer id, NamesDto namesDto) {
        Names name = mapperUtils.namesDtoToNames(namesDto);
        name.setId(id);
        namesRepository.save(name);
    }

    @Override
    public void createName(NamesDto namesDto) {
        namesRepository.save(mapperUtils.namesDtoToNames(namesDto));
    }

    @Override
    public List<NamesDto> getNamesByName(String name) {
        Iterable<Names> names = new ArrayList<>();
        if (name != null) {
            names = namesRepository.findByName(name);
        }
        if (names.iterator().hasNext()) {
            return StreamSupport.stream(names.spliterator(), false)
                    .map(mapperUtils::namesToNamesDto)
                    .collect(Collectors.toList());
        } else {
            return null;
        }
    }

    @Override
    public List<NamesDto> getNamesByGender(Character gender) {
        Iterable<Names> names = new ArrayList<>();
        if (gender != null) {
            names = namesRepository.findByGender(gender);
        }
        if (names.iterator().hasNext()) {
            return StreamSupport.stream(names.spliterator(), false)
                    .map(mapperUtils::namesToNamesDto)
                    .collect(Collectors.toList());
        } else {
            return null;
        }
    }
}
