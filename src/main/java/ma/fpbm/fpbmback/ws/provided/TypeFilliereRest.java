package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.TypeFiliere;
import ma.fpbm.fpbmback.service.imple.TypeFilliereServiveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypeFilliereRest {
    @Autowired
    private TypeFilliereServiveImpl typeFilliereServive;

    @GetMapping("/TypeFiliere")
    public List<TypeFiliere> getAllEquipe(){
        return typeFilliereServive.getAllTpFilliere();
    }

    @GetMapping("/TypeFilliere/{idTpFlr}")
    public TypeFiliere getEquipeById(@PathVariable Long idTpFlr){
        return typeFilliereServive.getTypeFillireById(idTpFlr);
    }

    @PostMapping("/tpFlr/saveTpFLr")
    public TypeFiliere saveEquipe(@RequestBody TypeFiliere typeFiliere){
        return typeFilliereServive.saveTpFilliere(typeFiliere);
    }

    @PutMapping("/updateTpFlr/{idTpFlr}")
    public TypeFiliere updateEquipe(@PathVariable Long idTpFlr,@RequestBody TypeFiliere typeFiliere){
        typeFiliere.setCode(typeFiliere.getCode());
        typeFiliere.setName(typeFiliere.getName());
        return typeFilliereServive.saveTpFilliere(typeFiliere);
    }

    @DeleteMapping("/deleteTpFlr/{idTpFlr}")
    public String deleteEquipe(@PathVariable Long idTpFlr){
        return typeFilliereServive.deleteTpFilliere(idTpFlr);
    }
}
