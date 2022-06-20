package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Equipe;
import ma.fpbm.fpbmback.service.facade.IEquipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipeRest {
    @Autowired
    public IEquipe equipeServices;

    @GetMapping("/equipe")
    public List<Equipe> getAllEquipe(){
        return equipeServices.getAllEquipes();
    }

    @GetMapping("/equipe/{equipeId}")
    public Equipe getEquipeById(@PathVariable Long equipeId){
        return equipeServices.getEquipeById(equipeId);
    }

    @PostMapping("/equipe/saveEquipe")
    public Equipe saveEquipe(@RequestBody Equipe equipe){
        return equipeServices.saveEquipe(equipe);
    }

    @PutMapping("/updateEquipe/{idEquipe}")
    public Equipe updateEquipe(@PathVariable Long idEquipe,@RequestBody Equipe equipe){
        equipe.setIdCed(equipe.getIdCed());
        return equipeServices.updateEquipe(equipe);
    }

    @DeleteMapping("/deleteequipe/{idEquipe}")
    public String deleteEquipe(@PathVariable Long idEquipe){
        return equipeServices.deleteEquipe(idEquipe);
    }


}
