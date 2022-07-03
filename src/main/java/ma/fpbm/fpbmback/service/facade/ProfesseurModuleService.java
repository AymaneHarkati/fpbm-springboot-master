package ma.fpbm.fpbmback.service.facade;


import ma.fpbm.fpbmback.beans.ProfesseurHasModule;

import java.util.List;

public interface ProfesseurModuleService {
    List<ProfesseurHasModule> findAll();
    ProfesseurHasModule save (ProfesseurHasModule professeurHasModule);
    void deleteByCode (long id);
    ProfesseurHasModule update (ProfesseurHasModule professeurHasModule);
}
