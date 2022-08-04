package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.ProfesseurHasModule;
import ma.fpbm.fpbmback.beans.ProfesseurHasModuleHasEtudiant;
import ma.fpbm.fpbmback.repository.ProfesseurModuleEtudiantRepository;
import ma.fpbm.fpbmback.service.facade.ProfesseurModuleEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;




@Service
@Transactional
public class ProfesseurModuleEtudiantServiceImpl implements ProfesseurModuleEtudiantService {

    @Autowired
    private ProfesseurModuleEtudiantRepository professeurModuleEtudiantRepository;
    @Override
    public List<ProfesseurHasModuleHasEtudiant> getAll(){
        return professeurModuleEtudiantRepository.findAll();
    }

    @Override
    public int countEffectif(String nomModule , String section){
        int countEff = 0;
        List<ProfesseurHasModuleHasEtudiant> list = professeurModuleEtudiantRepository.findAll();
        for(ProfesseurHasModuleHasEtudiant temp:list){
         if(nomModule.equals(temp.getProfesseurHasModule_id().getModule().getName()) && section.equals(temp.getProfesseurHasModule_id().getSection().getName())){
             countEff++;
         }
         System.out.println(temp.getProfesseurHasModule_id().getModule().getGroupes().getClass());
        }
        return countEff;
    }

    @Override
    public Page<ProfesseurHasModuleHasEtudiant> getByPage(int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        return professeurModuleEtudiantRepository.findAll(paging);
    }

    @Override
    public ProfesseurHasModuleHasEtudiant save(ProfesseurHasModuleHasEtudiant professeurHasModuleHasEtudiant) {
return professeurModuleEtudiantRepository.save(professeurHasModuleHasEtudiant)  ;  }

    @Override
    public String deleteById(Long id) {
        professeurModuleEtudiantRepository.deleteById(id);
        return "success";
    }

    @Override
    public ProfesseurHasModuleHasEtudiant update(ProfesseurHasModuleHasEtudiant professeurHasModuleEtudiant) {
        return professeurModuleEtudiantRepository.save(professeurHasModuleEtudiant);
    }
}
