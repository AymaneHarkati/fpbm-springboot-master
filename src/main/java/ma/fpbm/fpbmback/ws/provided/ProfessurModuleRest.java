package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.ProfesseurHasModule;
import ma.fpbm.fpbmback.service.facade.ProfesseurModuleService;
import ma.fpbm.fpbmback.service.imple.ProfesseurModuleServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("professeurModule")
public class ProfessurModuleRest {
    @Autowired
    private ProfesseurModuleServiceImple professurModuleService;

    @GetMapping
    public List<ProfesseurHasModule> findAll() {
        return professurModuleService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<ProfesseurHasModule> findById(@PathVariable Long id){
        return professurModuleService.findById(id);
    }
    @PostMapping
    public ProfesseurHasModule save(@RequestBody ProfesseurHasModule departement) {
        return professurModuleService.save(departement);
    }

    @DeleteMapping("/deletecode/{code}")
    public String deleteByCode(@PathVariable Long code) {
        professurModuleService.deleteByCode(code);
        return "Record Deleted";
    }

    @PutMapping
    public ProfesseurHasModule update(@RequestBody ProfesseurHasModule departement) {
        return professurModuleService.update(departement);
    }
}
