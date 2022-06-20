package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.Filiere;
import ma.fpbm.fpbmback.repository.ExamenRepository;
import ma.fpbm.fpbmback.repository.FilliereRepository;
import ma.fpbm.fpbmback.service.facade.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamenServiceImple implements ExamenService {
    @Autowired
    private ExamenRepository examenRepository;


    @Override
    public List<Examen> findAll() {
        return examenRepository.findAll();
    }

    @Override
    public Examen save(Examen examen) {
        // validate the input data :

        // validate the DB data;

       examenRepository.save(examen);

        return null;
    }

    @Override
    public int deleteByCode(String code) {
        return examenRepository.deleteByCode(code);
    }

    @Override
    public Examen update(Examen examen) {
        return null;
    }
}
