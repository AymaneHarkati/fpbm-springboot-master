package ma.fpbm.fpbmback.beans;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Module {
    @Id
    @Column(name = "Module_id")
    private Long id;
    private String groupes;
    @JsonIgnore
    @ManyToOne
    private Semestre semestre;

    @OneToMany(mappedBy = "idmodule")
    @ToString.Exclude
    private List<ProfesseurHasModule> professeurHasModules;

}
