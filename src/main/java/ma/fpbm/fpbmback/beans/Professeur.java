package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private List<Filiere> fillier;

    @OneToMany(mappedBy = "professeur")
    @JsonManagedReference
    private List<ProfesseurHasModule> professeurHasModules;

    //relation avec la table jury
    @OneToMany(mappedBy = "professeur")
    @JsonManagedReference
    private Collection<Jury> jury;

    //relation avec la table lieuTravail
    @ManyToOne
    @JsonBackReference
    private LieuDeTravail idLieuTravail;

    @OneToMany(mappedBy = "profSurveillant")
    @JsonManagedReference
    private Collection<Surveillant> surveillants;

    @ManyToOne
    private Examen id_examen;

    @ManyToOne
    private Extern id_extern;

}
