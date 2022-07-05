package ma.fpbm.fpbmback.beans;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Formula;

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
    @ToString.Exclude
    private Long id;
    @ToString.Exclude
    private String groupes;
    @ManyToOne
    @JsonManagedReference
    @ToString.Exclude
    private Semestre semestre;

    @OneToMany(mappedBy = "module")
    @JsonBackReference
    @ToString.Exclude
    private List<ProfesseurHasModule> professeurHasModules;


}
