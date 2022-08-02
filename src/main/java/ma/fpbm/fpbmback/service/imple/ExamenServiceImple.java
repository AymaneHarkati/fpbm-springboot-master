package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.repository.ExamenRepository;
import ma.fpbm.fpbmback.service.facade.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public Page<Examen> findByPage(int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        return examenRepository.findAll(paging);
    }

    @Override
    public Examen save(Examen examen) {
        // validate the input data :

        // validate the DB data;

        return examenRepository.save(examen);
    }

    @Override
    public String deleteById(Long code) {
        examenRepository.deleteById(code);
        return "Deleted";
    }

    @Override
    public Examen update(Examen examen) {
        return examenRepository.save(examen);
    }

    @Override
    public List<Object[]> query(){
        return examenRepository.query();
    }


}