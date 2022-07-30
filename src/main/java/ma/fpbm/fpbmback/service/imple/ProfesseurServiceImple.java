package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.Professeur;

import ma.fpbm.fpbmback.repository.ProfesseurRepository;

import ma.fpbm.fpbmback.service.facade.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurServiceImple implements ProfesseurService {
    @Autowired
    private ProfesseurRepository professeurRepository;

    @Override
    public Page<Professeur> findAll(int pageNo, int pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        return professeurRepository.findAll(paging);
    }

    @Override
    public List<Professeur> findAll() {
        return professeurRepository.findAll();
    }

    @Override
    public Optional<Professeur> findById(Long id) {
        return professeurRepository.findById(id);
    }

    public Professeur save(Professeur ced) {
        // validate the input data :
        return professeurRepository.save(ced);
    }

    @Override
    public String deleteByCode(Long id) {
        professeurRepository.deleteById(id);
        return "Deleted";
    }

    @Override
    public Professeur update(Professeur annee) {
        return professeurRepository.save(annee);
    }
}
