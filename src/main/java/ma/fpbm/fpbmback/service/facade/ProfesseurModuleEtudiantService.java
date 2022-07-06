package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.ProfesseurHasModuleHasEtudiant;

import java.util.List;

public interface ProfesseurModuleEtudiantService {
    public List<ProfesseurHasModuleHasEtudiant> getAll();

    public int countEffectif(String nomModule , String section);
}
