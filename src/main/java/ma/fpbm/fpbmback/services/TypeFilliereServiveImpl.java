package ma.fpbm.fpbmback.services;

import ma.fpbm.fpbmback.beans.TypeFiliere;
import ma.fpbm.fpbmback.repository.TypeFilliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TypeFilliereServiveImpl implements ITypeFillire{
    @Autowired
    private TypeFilliereRepository typeFilliereRepository;
    @Override
    public TypeFiliere getTypeFillireById(Long idTpFilliere){
        System.out.println("print");
        return typeFilliereRepository.findById(idTpFilliere).orElseThrow(() -> new RuntimeException("Type Filliere not found"));
    }

    @Override
    public List<TypeFiliere> getAllTpFilliere(){
        return typeFilliereRepository.findAll();
    }

    @Override
    public TypeFiliere saveTpFilliere(TypeFiliere typeFiliere){
        return typeFilliereRepository.save(typeFiliere);
    }

    @Override
    public TypeFiliere updateTpFilliere(TypeFiliere typeFiliere){
        return typeFilliereRepository.save(typeFiliere);
    }

    @Override
    public String deleteTpFilliere(Long idFilliere){
        try {
            typeFilliereRepository.deleteById(idFilliere);
            return "Departement deleted";
        }catch (Exception e){
            System.out.println(e);
        }
        return "Error while deleting departement";
    }




}
