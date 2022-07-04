package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Module;

import java.util.List;
import java.util.Optional;

public interface IModule {

    List<Module> findAll();
    Optional<Module> findById(Long id);
    Module save (Module module);
    String deleteById (Long code);
    Module update (Module module);

}
