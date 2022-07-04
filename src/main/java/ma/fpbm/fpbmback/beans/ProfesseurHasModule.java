package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference

    private Annee annee;
    @ManyToOne
    @JsonManagedReference

    private Professeur professeur;
    @ManyToOne
    @JsonManagedReference

    private Module module;
    @ManyToOne
    @JsonManagedReference

    private CoursTdTp coursTdTp;
    @ManyToOne
    @JsonManagedReference

    private Section section;

}
