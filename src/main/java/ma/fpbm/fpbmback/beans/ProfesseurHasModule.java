package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "professeur_has_module")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProfesseurHasModule {
    @Id
    @Column(name = "profModId")

    private int id;
    @ManyToOne

    private Annee annee;
    @ManyToOne

    private Professeur professeur;
    @ManyToOne

    private Module module;
    @ManyToOne

    private CoursTdTp coursTdTp;
    @ManyToOne
    private Section section;

}
