package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor @ToString
public class Professeur extends Personne {
    @ToString.Exclude
    private String grade;
    @ToString.Exclude
    private String telephone;


    @JsonBackReference
    @OneToMany(mappedBy = "responsable", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Filiere> fillier;
    @JsonBackReference
    @OneToMany(mappedBy = "professeur")
    @ToString.Exclude
    private List<ProfesseurHasModule> professeurHasModules;

    @JsonBackReference
    //relation avec la table jury
    @OneToMany(mappedBy = "professeur")
    @ToString.Exclude
    private Collection<Jury> jury;

    @JsonManagedReference
    @ManyToOne
    @ToString.Exclude
    private LieuDeTravail idLieuTravail;


    @OneToMany(mappedBy = "profSurveillant")
    @JsonBackReference
    @ToString.Exclude
    private Collection<Surveillant> surveillants;

    @JsonManagedReference
    @ManyToOne
    @ToString.Exclude
    private Examen id_examen;
    @JsonManagedReference
    @ManyToOne
    @ToString.Exclude
    private Extern id_extern;

}
