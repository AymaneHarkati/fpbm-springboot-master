package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CoursTdTp {
    @Id
    @Column(name = "id_courstptp")
    private int id;


    // reference set à la comparaison
    private String code;

    @OneToMany(mappedBy = "coursTdTp")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JsonBackReference
    private List<ProfesseurHasModule> professeurHasModules;

    private String typeDeResponsabilite;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CoursTdTp coursTdTp = (CoursTdTp) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
