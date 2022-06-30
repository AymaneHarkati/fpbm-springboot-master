package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import javax.persistence.*;
import java.util.Collection;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Examen {
    @Id @GeneratedValue
    private Long id;

    @Column
    private String jour;

    @Column
    private String heure;
    @JsonIgnore
    @ManyToOne
    private Salle salle;
    @JsonIgnore
    @ManyToOne
    private ProfesseurHasModule profHasModule;

    @OneToMany(mappedBy = "id_examen")
    private Collection<Surveillant> surveillants;
    @OneToMany(mappedBy = "examen")
    private Collection<ExamenHasProfesseurHasModuleHasEtudiant> examenProfModEtd;

}
