package ma.fpbm.fpbmback.controller;

import ma.fpbm.fpbmback.beans.Departement;
import ma.fpbm.fpbmback.services.IDepartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartementRest {
    @Autowired
    private IDepartement departementService;
    @GetMapping("/Departement")
    public List<Departement> getDepartement(Departement departement){
        return departementService.getDepartement(departement);
    }
    @GetMapping("/Departement/{departementId}")
    public Departement getDepartementByid(@PathVariable Long departementId) {
        return departementService.getDepartementById(departementId);
    }

    @PostMapping("/saveDepartement")
    public Departement saveDepartement(@RequestBody Departement departement) {
        return departementService.saveDepartement(departement);
    }
    @PutMapping("/updateDepartement/{idDep}")
    public Departement updateDepatement(@PathVariable Long idDep, @RequestBody Departement departement){
        departement.setId(idDep);
        return departementService.updateDepartement(departement);
    }
    @DeleteMapping("/deleteDepartement/{idDep}")
    public String deleteDepartement(@PathVariable long idDep){
        return departementService.deleteDepartement(idDep);
    }
}
