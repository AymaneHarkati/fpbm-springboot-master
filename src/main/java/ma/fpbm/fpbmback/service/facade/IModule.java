package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Module;
import ma.fpbm.fpbmback.beans.TypeFiliere;

import java.util.List;

public interface IModule {

    List<Module> findAll();
    Module save (Module module);
    String deleteById (Long code);
    Module update (Module module);

}
