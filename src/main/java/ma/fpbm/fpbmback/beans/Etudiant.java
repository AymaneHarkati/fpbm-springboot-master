package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private Filiere idfiliere;

    @OneToMany(mappedBy = "idEtudiant")
    @JsonBackReference
    private Collection<ProfesseurHasModuleHasEtudiant> professeurHasModuleHasEtudiants;


}