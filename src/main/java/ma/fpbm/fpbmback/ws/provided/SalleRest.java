package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Salle;
import ma.fpbm.fpbmback.service.imple.SalleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SalleRest {
    @Autowired
    private SalleServiceImpl salleService;

    @GetMapping("/{idSalle}")
    public Salle getSalleById(@PathVariable Long idSalle){
        return salleService.getSalleById(idSalle);
    }

    @GetMapping("/")
    public List<Salle> getAllSalle(){
        return salleService.getAllSalle();
    }

    @PutMapping("/")
    public Salle updateSalle(@RequestBody Salle salle){
        return salleService.updateSalle(salle);
    }

    @PostMapping("/")
    public Salle saveSalle(@RequestBody Salle salle){
        return salleService.saveSalle(salle);
    }

    @DeleteMapping("/")
    public String deleteSalle(@PathVariable Long idSalle){
        return salleService.deleteSalle(idSalle);
    }
}