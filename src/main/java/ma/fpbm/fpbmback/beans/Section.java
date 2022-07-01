package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    @Id
    @Column(name = "sectionId")
    private int id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
    private List<ProfesseurHasModule> professeurHasModules;

}
