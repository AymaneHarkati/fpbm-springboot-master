package ma.fpbm.fpbmback.ws.provided;


import ma.fpbm.fpbmback.service.imple.ModuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/module")
public class ModuleRest {

    @Autowired
    private ModuleServiceImpl moduleService;

    @GetMapping("/{idModule}")
    public Module getModuleById(@PathVariable Long idModule){
        return moduleService.getModuleById(idModule);
    }

    @GetMapping("/")
    public List<Module> getAllModule(){
        return moduleService.getAllModule();
    }

    @PutMapping("/")
    public Module updateModule(@RequestBody Module module){
        return moduleService.updateModule(module);
    }

    @PostMapping("/")
    public Module saveModule(@RequestBody Module module){
        return moduleService.saveModule(module);
    }

    @DeleteMapping("/")
    public String deleteModule(@PathVariable Long idModule){
        return moduleService.deleteModule(idModule);
    }



}
