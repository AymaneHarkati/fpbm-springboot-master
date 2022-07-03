package ma.fpbm.fpbmback.beans;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JsonBackReference
    private Professeur profSurveillant;

    @ManyToOne
    @JsonBackReference
    private Examen id_examen;

}
