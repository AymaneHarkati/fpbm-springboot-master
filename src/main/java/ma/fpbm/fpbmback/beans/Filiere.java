package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@NoArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String name;
    @JsonManagedReference
    @ManyToOne
    private Professeur responsable;
    @JsonManagedReference
    @ManyToOne
    private Type type;

    @JsonBackReference
    @OneToMany(mappedBy = "fillier_id")
    private List<Semestre> semestre;

    @JsonBackReference
    @OneToMany(mappedBy = "idfiliere")
    private List<Etudiant> etudiant;
    @JsonManagedReference
    @ManyToOne
    private Departement depart_filliere;

}