package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.repository.ModuleRepository;
import ma.fpbm.fpbmback.service.facade.IModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements IModule {

    @Autowired
    private ModuleRepository moduleRepository;
    @Override
    public Module getModuleById(Long idModule){
        return moduleRepository.findById(idModule).orElseThrow(() -> new RuntimeException("Module not found"));
    }

    @Override
    public List<Module> getAllModule() {
        return moduleRepository.findAll();
    }

    @Override
    public Module saveModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public Module updateModule(Module module) {
        return moduleRepository.save(module);
    }

    @Override
    public String deleteModule(Long idModule) {
        try {
            moduleRepository.deleteById(idModule);
            return "Module deleted";
        }catch (Exception e){
            System.out.println(e);
        }
        return "Error while deleting Module";
    }
}
