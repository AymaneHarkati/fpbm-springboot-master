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
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String name;

    @ManyToOne
    @JsonBackReference
    private Professeur responsable;

    @ManyToOne
    @JsonBackReference
    private Type type;
    @JsonManagedReference
    @OneToMany(mappedBy = "fillier_id")
    private List<Semestre> semestre;

    @OneToMany(mappedBy = "idfiliere")
    @JsonManagedReference
    private List<Etudiant> etudiant;

    @ManyToOne
    @JsonBackReference
    private Departement depart_filliere;

}