package ma.fpbm.fpbmback.repository;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExamenRepository extends JpaRepository<Examen,Long> {

}