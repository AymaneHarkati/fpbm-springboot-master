package ma.fpbm.fpbmback.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhdEtudiant extends Personne {
    private String sujet;
    @OneToMany(mappedBy = "phdEtudiant")
    private List<Inscription> inscription;
}
