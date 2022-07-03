package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.ProfesseurHasModule;
import ma.fpbm.fpbmback.repository.ProfesseurModuleRepository;
import ma.fpbm.fpbmback.service.facade.ProfesseurModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfesseurModuleServiceImple implements ProfesseurModuleService {
    @Autowired
    private ProfesseurModuleRepository professeurModuleRepository;

    @Override
    public List<ProfesseurHasModule> findAll() {
        return professeurModuleRepository.findAll();
    }

    @Override
    public ProfesseurHasModule save(ProfesseurHasModule professeurhasmodule) {
        return this.professeurModuleRepository.save(professeurhasmodule);
    }

    @Override
    public void deleteByCode(long code) {
        professeurModuleRepository.deleteById(code);
    }

    @Override
    public ProfesseurHasModule update(ProfesseurHasModule professeurHasModule) {
        return null;
    }
}
