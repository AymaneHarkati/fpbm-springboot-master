package ma.fpbm.fpbmback.beans;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "professeur_has_module")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfesseurHasModule {
    @Id
    @Column(name = "profModId")
    private int id;
    @ManyToOne
    private Annee idannee;
    @ManyToOne
    private Professeur idprofesseur;
    @ManyToOne
    private Module idmodule;
    @ManyToOne
    private CoursTdTp idcoursTdTp;
    @ManyToOne
    private Section idsection;

    @OneToMany(mappedBy = "profHasModule")
    private Collection<Examen> examen;

    @OneToMany(mappedBy = "professeurHasModule_id")
    private Collection<ProfesseurHasModuleHasEtudiant> professeurHasModuleHasEtudiants;




}
