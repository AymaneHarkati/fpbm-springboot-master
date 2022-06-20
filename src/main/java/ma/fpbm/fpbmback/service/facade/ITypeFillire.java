package ma.fpbm.fpbmback.service.facade;


import ma.fpbm.fpbmback.beans.TypeFiliere;

import java.util.List;

public interface ITypeFillire {

    TypeFiliere getTypeFillireById(Long idTpFilliere);
    List<TypeFiliere> getAllTpFilliere();
    TypeFiliere saveTpFilliere(TypeFiliere typeFiliere);
    TypeFiliere updateTpFilliere(TypeFiliere typeFiliere);
    String deleteTpFilliere(Long idFilliere);
}
