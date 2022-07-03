package ma.fpbm.fpbmback.beans;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String name;
    private String groupes;

    @ManyToOne
    @JsonBackReference
    private Semestre semestre;

    @OneToMany(mappedBy = "module")
    @JsonManagedReference
    private List<ProfesseurHasModule> professeurHasModules;

}
