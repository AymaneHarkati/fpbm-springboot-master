package ma.fpbm.fpbmback.services;

import ma.fpbm.fpbmback.beans.Departement;
import ma.fpbm.fpbmback.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class DepartementServiceImp implements IDepartement {
    @Autowired
    private DepartementRepository departementRepository;

    @Override
    public Departement saveDepartement(Departement departement) {
        System.out.println("Saving Departement...");
        Departement saveDepartement = departementRepository.save(departement);
        return saveDepartement;
    }

    @Override
    public List<Departement> getDepartement() {
         List<Departement> departementList = departementRepository.findAll();
         return departementList;
    }

    @Override
    public Departement getDepartementById(Long deparementId) {
        Departement departement = departementRepository.findById(deparementId)
                .orElseThrow(() -> new RuntimeException("Departement not found"));
        return departement;
    }

    @Override
    public Departement updateDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public String deleteDepartement(Long departementId) {
        try {
            departementRepository.deleteById(departementId);
            return "Departement deleted";
        }catch (Exception e){
            System.out.println(e);
        }
        return "Error while deleting departement";
    }
}
