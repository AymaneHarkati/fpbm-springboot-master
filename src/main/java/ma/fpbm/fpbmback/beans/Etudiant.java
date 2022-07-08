package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity @Data @ToString
@NoArgsConstructor @AllArgsConstructor
public class Etudiant extends Personne{

    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Filiere idfiliere;

    @OneToMany(mappedBy = "idEtudiant")
    @JsonBackReference
    private Collection<ProfesseurHasModuleHasEtudiant> professeurHasModuleHasEtudiants;


    
}