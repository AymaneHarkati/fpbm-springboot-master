package ma.fpbm.fpbmback.services;

import ma.fpbm.fpbmback.beans.Departement;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface IDepartement {
    Departement saveDepartement(Departement departement);
    List<Departement> getDepartement(Departement departement);


    Departement getDepartementById(Long deparementId);

    Departement updateDepartement(Departement departement);

    String deleteDepartement(Long departementId);
}
