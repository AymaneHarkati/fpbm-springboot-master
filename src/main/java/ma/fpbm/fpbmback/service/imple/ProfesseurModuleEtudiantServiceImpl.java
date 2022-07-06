package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.ProfesseurHasModuleHasEtudiant;
import ma.fpbm.fpbmback.repository.ProfesseurModuleEtudiantRepository;
import ma.fpbm.fpbmback.service.facade.ProfesseurModuleEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
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
         if(nomModule.equals(temp.getProfesseurHasModule_id().getModule().getGroupes()) && section.equals(temp.getProfesseurHasModule_id().getSection().getName())){
             countEff++;
         }
         System.out.println(temp.getProfesseurHasModule_id().getModule().getGroupes().getClass());
        }
        return countEff;
    }
}
