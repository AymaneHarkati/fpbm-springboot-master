package ma.fpbm.fpbmback.beans;

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
    @JsonIgnore @ToString.Exclude
    @ManyToOne
    private Type type;
    @JsonIgnore @ToString.Exclude
    @OneToMany(mappedBy = "fillier_id")
    private List<Semestre> semestre;
    @JsonIgnore @ToString.Exclude
    @OneToMany(mappedBy = "idfiliere")
    private List<Etudiant> etudiant;
    @JsonIgnore @ToString.Exclude
    @ManyToOne
    private Departement depart_filliere;

}