package ma.fpbm.fpbmback.service.facade;

import ma.fpbm.fpbmback.beans.Departement;
import ma.fpbm.fpbmback.beans.Filiere;

import java.util.List;

public interface IFilliereService {
    List<Filiere> findAll();
    Filiere save (Filiere filiere);
    int deleteByCode (String code);
    Filiere update (Filiere filiere);
}
