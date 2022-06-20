package ma.fpbm.fpbmback.repository;

import ma.fpbm.fpbmback.beans.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<Salle,Long> {
}
