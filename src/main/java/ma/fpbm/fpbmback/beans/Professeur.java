package ma.fpbm.fpbmback.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professeur extends Personne {
    private String grade;
    private String telephone;

    @OneToMany(mappedBy = "responsable")
    private List<Filiere> fillier;

    @OneToMany(mappedBy = "idprofesseur")
    private List<ProfesseurHasModule> professeurHasModules;

    //relation avec la table jury
    @OneToMany(mappedBy = "professeur")
    private Collection<Jury> jury;

    //relation avec la table lieuTravail
    @ManyToOne
    private LieuDeTravail idLieuTravail;

    @OneToMany(mappedBy = "profSurveillant")
    private Collection<Surveillant> surveillants;

    @ManyToOne
    private Examen id_examen;

    @ManyToOne
    private Extern id_extern;

}
