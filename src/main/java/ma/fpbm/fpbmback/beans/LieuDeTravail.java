package ma.fpbm.fpbmback.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
public class LieuDeTravail {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "idLieuTravail")
    private Collection<Professeur> professeurs;
}
