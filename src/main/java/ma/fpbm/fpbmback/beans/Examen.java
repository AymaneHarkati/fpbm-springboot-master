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
    private Long id;

    @Column
    private String jour;

    @Column
    private String heure;



    @ManyToOne
    private Salle salle;

    @ManyToOne(fetch = FetchType.LAZY)
    private ProfesseurHasModule profHasModule;

    @OneToMany(mappedBy = "id_examen")
    @JsonBackReference(value = "surveillants")
    private Collection<Surveillant> surveillants;

    @OneToMany(mappedBy = "examen")
    @JsonBackReference(value = "examenProfModEtd")
    private Collection<ExamenHasProfesseurHasModuleHasEtudiant> examenProfModEtd;

}
