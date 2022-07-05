package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Section {
    @Id
    @Column(name = "sectionId")
    @ToString.Exclude
    private Long id;
    @ToString.Exclude
    private String name;
    @ToString.Exclude
    @OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<ProfesseurHasModule> professeurHasModules;

}
