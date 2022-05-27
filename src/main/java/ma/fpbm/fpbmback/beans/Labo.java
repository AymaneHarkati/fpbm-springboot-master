package ma.fpbm.fpbmback.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Labo {
    @Id
    private int id;
    @ManyToOne
    private Ced ced;
}
