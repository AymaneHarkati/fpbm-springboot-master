package ma.fpbm.fpbmback.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class Ced {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCed;

    @OneToMany(mappedBy = "ced")
    private List<Labo> labo;
    @OneToMany(mappedBy = "idCed")
    private List<PhdEtudiant> phdEtudiants;
    @OneToMany(mappedBy = "idCed")
    private  List<Equipe> equipes;
}
