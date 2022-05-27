package ma.fpbm.fpbmback.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String name;
    @ManyToOne
    private Professeur responsable;
    @ManyToOne
    private Type type;
    @OneToMany(mappedBy = "fillier_id")
    private List<Semestre> semestre;
    @OneToMany(mappedBy = "idfiliere")
    private List<Etudiant> etudiant;

}