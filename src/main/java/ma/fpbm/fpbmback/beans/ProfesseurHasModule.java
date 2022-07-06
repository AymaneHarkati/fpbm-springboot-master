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
    @ToString.Exclude
    private int id;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Annee annee;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Professeur professeur;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Module module;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private CoursTdTp coursTdTp;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Section section;



}
