package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.Filiere;
import ma.fpbm.fpbmback.beans.Personne;
import ma.fpbm.fpbmback.service.facade.ExamenService;
import ma.fpbm.fpbmback.service.imple.ExamenServiceImple;
import ma.fpbm.fpbmback.service.imple.FilliereServiceImple;
import ma.fpbm.fpbmback.service.imple.PeronneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/examen")
public class ExamenRest {
    @Autowired
    private ExamenServiceImple examenServiceImple;

    @Autowired
    private PeronneServiceImpl peronneService;
    @GetMapping("/o")
    public List<Personne> getAll(){
        return peronneService.getAllPersonne();
    }
    //hello
    @GetMapping
    public List<Examen> findAll() {
        return examenServiceImple.findAll();
    }

    @PostMapping
    public Examen save(@RequestBody Examen examen) {
        return examenServiceImple.save(examen);
    }

    @DeleteMapping("/deletecode/{code}")
    public String deleteByCode(@PathVariable Long code) {
        return examenServiceImple.deleteById(code);
    }

    @PutMapping
    public Examen update(@RequestBody Examen examen) {
        return examenServiceImple.update(examen);
    }

    @GetMapping("/join")
    public List<Object[]> query() {
        return examenServiceImple.query();
    }
}