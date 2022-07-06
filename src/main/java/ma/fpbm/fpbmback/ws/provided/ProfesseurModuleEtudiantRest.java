package ma.fpbm.fpbmback.ws.provided;


import ma.fpbm.fpbmback.beans.ProfesseurHasModuleHasEtudiant;
import ma.fpbm.fpbmback.service.imple.ProfesseurModuleEtudiantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profmodetud")
public class ProfesseurModuleEtudiantRest {

    @Autowired
    private ProfesseurModuleEtudiantServiceImpl professeurModuleEtudiantService;

    @GetMapping("/")
    public List<ProfesseurHasModuleHasEtudiant> getAll(){
        return professeurModuleEtudiantService.getAll();
    }

    @GetMapping("/count")
    public int countEffectif(){
        return professeurModuleEtudiantService.countEffectif("M01:Analyse","section B");
    }
}
