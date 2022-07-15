package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class Soutenance {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String sujet;

    @Column
    private Date date;

    @Column
    private String soutenanceCol;

    //Relation oTm avec la table Jury
    @OneToMany(mappedBy = "jury_soutenance")
    @JsonBackReference
    private Collection<Jury> jury;

    //relation avec la table salle

    @ManyToOne
    @JsonManagedReference
    private Salle salle;

    //relation avec la table phdStudent
    @ManyToOne
    @JsonManagedReference

    private PhdEtudiant phdEtudiant_sout;

    //relation avec la table professeur
    @ManyToOne
    @JsonManagedReference

    private Professeur professeur;

    //relation avec la table soutenance
    @ManyToOne
    @JsonManagedReference
    private Salle salle_sout;



}
