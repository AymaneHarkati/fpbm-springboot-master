package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.Etudiant;
import ma.fpbm.fpbmback.repository.EtudiantRepository;
import ma.fpbm.fpbmback.service.facade.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> getAll(){
        return etudiantRepository.findAll();
    }
}
