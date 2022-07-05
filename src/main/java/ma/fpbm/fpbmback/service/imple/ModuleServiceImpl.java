package ma.fpbm.fpbmback.service.imple;


import ma.fpbm.fpbmback.repository.ModuleRepository;
import ma.fpbm.fpbmback.service.facade.IModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import ma.fpbm.fpbmback.beans.Module;
@Service
@Transactional
public class ModuleServiceImpl implements IModule {

    @Autowired
    private ModuleRepository moduleRepository;

    @Override
    public List<Module> findAll() {
       return moduleRepository.findAll();

    }

    @Override
    public Optional<Module> findById(Long id) {
        return moduleRepository.findById(id);
    }

    @Override
    public Module save(Module module) {
        // validate the input data :

        // validate the DB data;

        moduleRepository.save(module);

        return null;
    }

    @Override
    public String deleteById(Long code) {
        moduleRepository.deleteById(code);
        return "Deleted";
    }

    @Override
    public Module update(Module module) {
        return moduleRepository.save(module);
    }
}
