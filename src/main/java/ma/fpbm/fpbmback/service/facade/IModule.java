package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.TypeFiliere;

import java.util.List;

public interface IModule {

    Module getModuleById(Long idModule);
    List<Module> getAllModule();
    Module saveModule(Module module);
    Module updateModule(Module module);
    String deleteModule(Long idModule);
}
