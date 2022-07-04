package ma.fpbm.fpbmback.ws.provided;


import ma.fpbm.fpbmback.beans.Module;
import ma.fpbm.fpbmback.service.imple.ModuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "module")
public class ModuleRest {

    @Autowired
    private ModuleServiceImpl moduleServiceImple;

    @GetMapping
    public List<Module> findAll() {
        return moduleServiceImple.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Module> findById(@PathVariable Long id){
        return moduleServiceImple.findById(id);
    }

    @PostMapping
    public Module save(@RequestBody Module module) {
        return moduleServiceImple.save(module);
    }

    @DeleteMapping("/deletecode/{code}")
    public String deleteByCode(@PathVariable Long code) {
        return moduleServiceImple.deleteById(code);
    }

    @PutMapping
    public Module update(@RequestBody Module module) {
        return moduleServiceImple.update(module);
    }



}
