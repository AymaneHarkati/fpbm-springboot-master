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

    @JsonBackReference
    @OneToMany(mappedBy = "responsable", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Filiere> fillier;
    @JsonBackReference
    @OneToMany(mappedBy = "professeur")
    private List<ProfesseurHasModule> professeurHasModules;

    @JsonBackReference
    //relation avec la table jury
    @OneToMany(mappedBy = "professeur")
    private Collection<Jury> jury;

    @JsonManagedReference
    @ManyToOne
    private LieuDeTravail idLieuTravail;


    @OneToMany(mappedBy = "profSurveillant")
    @JsonBackReference
    private Collection<Surveillant> surveillants;

    @JsonManagedReference
    @ManyToOne
    private Examen id_examen;
    @JsonManagedReference
    @ManyToOne
    private Extern id_extern;

}
