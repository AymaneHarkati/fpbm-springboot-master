package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.Filiere;

import java.util.List;

public interface ExamenService {
    List<Examen> findAll();
    Examen save (Examen examen);
    String deleteById (Long code);
    Examen update (Examen examen);
}
