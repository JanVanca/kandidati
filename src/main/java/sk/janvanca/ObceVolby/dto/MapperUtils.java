package sk.janvanca.ObceVolby.dto;

import org.springframework.stereotype.Component;
import sk.janvanca.ObceVolby.domain.KandidatiStarostovia2006;
import sk.janvanca.ObceVolby.domain.Names;

@Component
public class MapperUtils {

    public NamesDto namesToNamesDto(Names name) {
        if (name != null) {
            NamesDto namesDto = new NamesDto();
            namesDto.setId(name.getId());
            namesDto.setName(name.getName());
            namesDto.setGender(name.getGender());
            return namesDto;
        } else {
            return null;
        }
    }

    public Names namesDtoToNames(NamesDto namesDto) {
        if (namesDto != null) {
            Names names = new Names();
            names.setId(namesDto.getId());
            names.setName(namesDto.getName());
            names.setGender(namesDto.getGender());
            return names;
        } else {
            return null;
        }
    }

    public KandidatiStarostovia2006Dto kandidatiStarostovia2006ToKandidatiStarostovia2006Dto(KandidatiStarostovia2006 kandidatiStarostovia2006) {
        if (kandidatiStarostovia2006 != null) {
            KandidatiStarostovia2006Dto kandidatiStarostovia2006Dto = new KandidatiStarostovia2006Dto();
            kandidatiStarostovia2006Dto.setId(kandidatiStarostovia2006.getId());
            kandidatiStarostovia2006Dto.setKodObvodu(kandidatiStarostovia2006.getKodObvodu());
            kandidatiStarostovia2006Dto.setNazovObvodu(kandidatiStarostovia2006.getNazovObvodu());
            kandidatiStarostovia2006Dto.setNazovObce(kandidatiStarostovia2006.getNazovObce());
            kandidatiStarostovia2006Dto.setMeno(kandidatiStarostovia2006.getMeno());
            kandidatiStarostovia2006Dto.setPriezvisko(kandidatiStarostovia2006.getPriezvisko());
            kandidatiStarostovia2006Dto.setPohlavie(kandidatiStarostovia2006.getPohlavie());
            kandidatiStarostovia2006Dto.setPocetHlasov(kandidatiStarostovia2006.getPocetHlasov());
            kandidatiStarostovia2006Dto.setPolitickySubjekt(kandidatiStarostovia2006.getPolitickySubjekt());
            return kandidatiStarostovia2006Dto;
        } else {
            return null;
        }
    }

    public KandidatiStarostovia2006 kandidatiStarostovia2006DtoToKandidatiStarostovia2006(KandidatiStarostovia2006Dto kandidatiStarostovia2006Dto) {
        if (kandidatiStarostovia2006Dto != null) {
            KandidatiStarostovia2006 kandidatiStarostovia2006 = new KandidatiStarostovia2006();
            kandidatiStarostovia2006.setId(kandidatiStarostovia2006Dto.getId());
            kandidatiStarostovia2006.setKodObvodu(kandidatiStarostovia2006Dto.getKodObvodu());
            kandidatiStarostovia2006.setNazovObce(kandidatiStarostovia2006Dto.getNazovObce());
            kandidatiStarostovia2006.setNazovObce(kandidatiStarostovia2006Dto.getNazovObce());
            kandidatiStarostovia2006.setMeno(kandidatiStarostovia2006Dto.getMeno());
            kandidatiStarostovia2006.setPriezvisko(kandidatiStarostovia2006Dto.getPriezvisko());
            kandidatiStarostovia2006.setPohlavie(kandidatiStarostovia2006Dto.getPohlavie());
            kandidatiStarostovia2006.setPocetHlasov(kandidatiStarostovia2006Dto.getPocetHlasov());
            kandidatiStarostovia2006.setPolitickySubjekt(kandidatiStarostovia2006Dto.getPolitickySubjekt());
            return kandidatiStarostovia2006;
        } else {
            return null;
        }
    }
}
