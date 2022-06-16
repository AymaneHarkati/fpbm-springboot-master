package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Departement;

import java.util.List;

public interface DepartementService {
    List<Departement> findAll();
    Departement save (Departement departement);
    int deleteByCode (String code);
    Departement update (Departement departement);
}
