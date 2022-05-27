package ma.fpbm.fpbmback.beans;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    @Id
    private int id;
    private String nom;
    @OneToMany
    (mappedBy = "type")
    private List<Filiere> fillier; // Filler has many type

}
