package ma.fpbm.fpbmback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ModuleRepository extends JpaRepository<Module,Long> {
}
