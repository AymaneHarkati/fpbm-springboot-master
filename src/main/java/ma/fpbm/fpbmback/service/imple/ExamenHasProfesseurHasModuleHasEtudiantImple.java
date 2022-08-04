package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.ExamenHasProfesseurHasModuleHasEtudiant;
import ma.fpbm.fpbmback.beans.ProfesseurHasModule;
import ma.fpbm.fpbmback.repository.ExamenHasProfesseurHasModuleHasEtudiantRepository;
import ma.fpbm.fpbmback.service.facade.ExamenHasProfesseurHasModuleHasEtudiantImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenHasProfesseurHasModuleHasEtudiantImple implements ExamenHasProfesseurHasModuleHasEtudiantImpl {
    public int count = 0;
    @Autowired
    private ExamenHasProfesseurHasModuleHasEtudiantRepository examenHasProfesseurHasModuleHasEtudiantRepository;

    @Override
    public List<ExamenHasProfesseurHasModuleHasEtudiant> getAll(){
        return examenHasProfesseurHasModuleHasEtudiantRepository.findAll();
    }

    @Override
    public Page<ExamenHasProfesseurHasModuleHasEtudiant> findAll(int pageNo, int pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize);
        return examenHasProfesseurHasModuleHasEtudiantRepository.findAll(paging);
    }

    @Override
    public Optional<ExamenHasProfesseurHasModuleHasEtudiant> findById(Long id) {
        return examenHasProfesseurHasModuleHasEtudiantRepository.findById(id);
    }

    @Override
    public ExamenHasProfesseurHasModuleHasEtudiant save(ExamenHasProfesseurHasModuleHasEtudiant examenHasProfesseurHasModuleHasEtudiant) {
        return this.examenHasProfesseurHasModuleHasEtudiantRepository.save(examenHasProfesseurHasModuleHasEtudiant);
    }

    @Override
    public void deleteByCode(long code) {
        examenHasProfesseurHasModuleHasEtudiantRepository.deleteById(code);
    }

    @Override
    public ExamenHasProfesseurHasModuleHasEtudiant update(ExamenHasProfesseurHasModuleHasEtudiant examenHasProfesseurHasModuleHasEtudiant) {
        return null;
    }

    @Override
    public int countEffectif(int idExamen){
        this.count = 0;
        List<ExamenHasProfesseurHasModuleHasEtudiant> temp = examenHasProfesseurHasModuleHasEtudiantRepository.findAll();
        for(ExamenHasProfesseurHasModuleHasEtudiant spec:temp){
            if (spec.getExamen().getId() == idExamen){
                this.count++;
            }
        }
        return this.count;
    }
}

