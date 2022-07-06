package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Etudiant;
import ma.fpbm.fpbmback.service.imple.EtudiantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRest {
    @Autowired
    private EtudiantServiceImpl etudiantService;

    @GetMapping("/")
    public List<Etudiant> getAll(){
        return etudiantService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Etudiant> findById(Long id){
        return etudiantService.findById(id);
    }
    @PostMapping
    public Etudiant save(@RequestBody Etudiant etudiant){
        return etudiantService.save(etudiant);
    }
    @PutMapping
    public String update(@RequestBody Etudiant etudiant){
        return etudiantService.update(etudiant);
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        return etudiantService.deletebyId(id);
    }

}
