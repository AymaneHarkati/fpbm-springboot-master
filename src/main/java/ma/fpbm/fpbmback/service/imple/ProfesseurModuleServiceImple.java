package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.ProfesseurHasModule;
import ma.fpbm.fpbmback.repository.ProfesseurModuleRepository;
import ma.fpbm.fpbmback.service.facade.ProfesseurModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurModuleServiceImple implements ProfesseurModuleService {
    @Autowired
    private ProfesseurModuleRepository professeurModuleRepository;

    @Override
    public Page<ProfesseurHasModule> findAll(int pageNo, int pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize);
        return professeurModuleRepository.findAll(paging);
    }

    @Override
    public List<ProfesseurHasModule> findAll() {
        return professeurModuleRepository.findAll();
    }

    @Override
    public Optional<ProfesseurHasModule> findById(Long id) {
        return professeurModuleRepository.findById(id);
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
        return professeurModuleRepository.save(professeurHasModule);
    }
}
