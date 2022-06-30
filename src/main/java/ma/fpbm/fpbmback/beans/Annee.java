package ma.fpbm.fpbmback.beans;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Annee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private String annee;
    @OneToMany(mappedBy = "annee")
    private List<ProfesseurHasModule> professeurHasModules;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return annee;
    }

    public void setName(String annee) {
        this.annee = annee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Annee that = (Annee) o;
        return annee.equals(that.annee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annee);
    }
}
