package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Filiere;
import ma.fpbm.fpbmback.beans.Section;

import java.util.List;

public interface SectionService {
    List<Section> findAll();
    Section save (Section section);
    int deleteByCode (String code);
    Section update (Section section);
}
