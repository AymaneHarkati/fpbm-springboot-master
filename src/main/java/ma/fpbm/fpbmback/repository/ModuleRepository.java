package ma.fpbm.fpbmback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.fpbm.fpbmback.beans.Module;


public interface ModuleRepository extends JpaRepository<Module,Long> {
}
