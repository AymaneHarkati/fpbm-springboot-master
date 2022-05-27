package ma.fpbm.fpbmback.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant extends Personne{
    @ManyToOne
    private Filiere idfiliere;
}