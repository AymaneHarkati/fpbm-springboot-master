package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Etudiant;
import ma.fpbm.fpbmback.service.imple.EtudiantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRest {
    @Autowired
    private EtudiantServiceImpl etudiantService;

    @GetMapping("/")
    public List<Etudiant> getAll(){
        return etudiantService.getAll();
    }
}
