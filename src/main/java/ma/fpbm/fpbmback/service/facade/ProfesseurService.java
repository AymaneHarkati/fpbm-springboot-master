package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Professeur;

import java.util.List;
import java.util.Optional;

public interface ProfesseurService {
    List<Professeur> findAll();
    Optional<Professeur> findById(Long id);
    Professeur save (Professeur prof);
    String deleteByCode (Long id);
    Professeur update (Professeur prof);
}
