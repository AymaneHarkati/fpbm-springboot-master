package ma.fpbm.fpbmback.service.imple;

import ma.fpbm.fpbmback.beans.Etudiant;
import ma.fpbm.fpbmback.repository.EtudiantRepository;
import ma.fpbm.fpbmback.service.facade.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> getAll(){
        return etudiantRepository.findAll(Sort.by(Sort.Direction.ASC,"nom"));
    }

    @Override
    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public Etudiant save(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public String deletebyId(Long id) {
        etudiantRepository.deleteById(id);
        return "Delete Student";
    }

    @Override
    public String update(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
        return "Updated";
    }

    @Override
    public Page<Etudiant> getByPage(int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        return etudiantRepository.findAll(paging);
    }
}
