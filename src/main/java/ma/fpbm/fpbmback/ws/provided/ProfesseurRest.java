package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Professeur;
import ma.fpbm.fpbmback.beans.Professeur;
import ma.fpbm.fpbmback.service.imple.ProfesseurServiceImple;
import ma.fpbm.fpbmback.service.imple.ProfesseurServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("professeur")
public class ProfesseurRest {
    @Autowired
    private ProfesseurServiceImple professeurService;

    @GetMapping
    public List<Professeur> findAll() {
        return professeurService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Professeur> findById(@PathVariable Long id){
        return professeurService.findById(id);
    }
    @PostMapping
    public Professeur save(@RequestBody Professeur prof) {
        return professeurService.save(prof);
    }

    @DeleteMapping("/deletecode/{code}")
    public String deleteByCode(@PathVariable Long code) {
        return professeurService.deleteByCode(code);
    }

    @PutMapping
    public Professeur update(@RequestBody Professeur prof) {
        return professeurService.update(prof);
    }
}
