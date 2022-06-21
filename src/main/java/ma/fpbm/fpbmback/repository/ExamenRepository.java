package ma.fpbm.fpbmback.repository;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen,Long> {
}