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
@ToString
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ToString.Exclude
    private Long id;
    @ToString.Exclude
    @Column
    private String code;
    @ToString.Exclude
    @Column
    private String name;
    @ToString.Exclude
    @JsonManagedReference
    @ManyToOne
    private Professeur responsable;
    @ToString.Exclude
    @JsonManagedReference
    @ManyToOne
    private Type type;
    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "fillier_id")
    private List<Semestre> semestre;
    @ToString.Exclude
    @JsonBackReference
    @OneToMany(mappedBy = "idfiliere")
    private List<Etudiant> etudiant;
    @ToString.Exclude
    @JsonManagedReference
    @ManyToOne
    private Departement depart_filliere;

}