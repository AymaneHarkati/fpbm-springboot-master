package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class ProfesseurHasModuleHasEtudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonManagedReference
    private Etudiant idEtudiant;

    @ManyToOne
    @JsonManagedReference
    private ProfesseurHasModule professeurHasModule_id;
    @OneToMany(mappedBy = "professeurHasModuleHasEtudiant")
    @JsonBackReference
    private Collection<ExamenHasProfesseurHasModuleHasEtudiant> examenProfModEtd;
}
