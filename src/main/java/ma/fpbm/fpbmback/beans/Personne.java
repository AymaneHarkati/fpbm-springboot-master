package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Personne extends User {

    private String cin;
    private String cne;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String Address;


}
