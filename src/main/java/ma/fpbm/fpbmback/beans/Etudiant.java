package ma.fpbm.fpbmback.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Etudiant extends Personne{
    @ManyToOne
    private Filiere idfiliere;

    @OneToMany(mappedBy = "idEtudiant")
    private Collection<ProfesseurHasModuleHasEtudiant> professeurHasModuleHasEtudiants;


}