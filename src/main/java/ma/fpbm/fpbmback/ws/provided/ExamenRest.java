package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.Filiere;
import ma.fpbm.fpbmback.service.facade.ExamenService;
import ma.fpbm.fpbmback.service.imple.ExamenServiceImple;
import ma.fpbm.fpbmback.service.imple.FilliereServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "examen")
public class ExamenRest {
    @Autowired
    private ExamenServiceImple examenServiceImple;

    @GetMapping("/")
    public List<Examen> findAll() {
        return examenServiceImple.findAll();
    }

    @PostMapping("/")
    public Examen save(@RequestBody Examen examen) {
        return examenServiceImple.save(examen);
    }

    @DeleteMapping("/deletecode/{code}")
    public int deleteByCode(@PathVariable String code) {
        return examenServiceImple.deleteByCode(code);
    }

    @PutMapping("/")
    public Examen update(@RequestBody Examen examen) {
        return examenServiceImple.update(examen);
    }
}
