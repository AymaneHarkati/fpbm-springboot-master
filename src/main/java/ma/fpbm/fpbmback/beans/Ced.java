package ma.fpbm.fpbmback.beans;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Ced {
    @Id
    private int idCed;
    @OneToMany(mappedBy = "ced")
    private List<Labo> labo;

    @OneToMany(mappedBy = "idCed")
    private  List<Equipe> equipes;
}
