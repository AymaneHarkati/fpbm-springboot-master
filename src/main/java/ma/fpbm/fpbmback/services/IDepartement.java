package ma.fpbm.fpbmback.services;

import ma.fpbm.fpbmback.beans.Departement;

import java.util.List;

public interface IDepartement {
    Departement saveDepartement(Departement departement);
    List<Departement> getDepartement(Departement departement);


    Departement getDepartementById(Long deparementId);

    Departement updateDepartement(Departement departement);

    String deleteDepartement(Long departementId);
}
