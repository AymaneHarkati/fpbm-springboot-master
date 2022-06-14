package ma.fpbm.fpbmback.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Surveillant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_surveillant;

    @ManyToOne
    private Professeur profSurveillant;

    @ManyToOne
    private Examen id_examen;

}
