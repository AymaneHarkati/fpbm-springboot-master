package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import javax.persistence.*;
import java.util.Collection;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Examen {
    @Id @GeneratedValue
    @ToString.Exclude
    private Long id;
    @ToString.Exclude
    @Column
    private String jour;

    @Column
    @ToString.Exclude
    private String heure;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Salle salle;


    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private ProfesseurHasModule profHasModule;

    @OneToMany(mappedBy = "id_examen")
    @JsonBackReference
    @ToString.Exclude
    private Collection<Surveillant> surveillants;
    @OneToMany(mappedBy = "examen")
    @JsonBackReference
    @ToString.Exclude
    private Collection<ExamenHasProfesseurHasModuleHasEtudiant> examenProfModEtd;

}
