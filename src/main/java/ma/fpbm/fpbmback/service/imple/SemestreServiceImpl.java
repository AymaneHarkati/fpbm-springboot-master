package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.Semestre;
import ma.fpbm.fpbmback.repository.SemestreRepository;
import ma.fpbm.fpbmback.service.facade.ISemestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemestreServiceImpl implements ISemestre {
    @Autowired
    private SemestreRepository semestreRepository;
    @Override
    public Semestre getSemestreById(Long idSemestre){
        return semestreRepository.findById(idSemestre).orElseThrow(() -> new RuntimeException("Semestre not found"));
    }

    @Override
    public List<Semestre> getAllSemestre() {
        return semestreRepository.findAll();
    }

    @Override
    public Semestre saveSemestre(Semestre semestre) {
        return semestreRepository.save(semestre);
    }

    @Override
    public Semestre updateSemestre(Semestre semestre) {
        return semestreRepository.save(semestre);
    }

    @Override
    public String deleteSemestre(Long idSemestre) {
        try {
            semestreRepository.deleteById(idSemestre);
            return "Semestre deleted";
        }catch (Exception e){
            System.out.println(e);
        }
        return "Error while deleting Semestre";
    }
}
