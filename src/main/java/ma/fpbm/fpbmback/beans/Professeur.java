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
public class Professeur extends Personne {
    private String grade;
    private String telephone;

    @OneToMany(mappedBy = "responsable")
    private List<Filiere> fillier;
    @OneToMany(mappedBy = "idprofesseur")
    private List<ProfesseurHasModule> professeurHasModules;

}
