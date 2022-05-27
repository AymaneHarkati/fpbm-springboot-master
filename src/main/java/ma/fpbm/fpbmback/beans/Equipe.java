package ma.fpbm.fpbmback.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equipe {
    @Id
    private int idEquipe;
    @ManyToOne
    private Ced idCed;
}
