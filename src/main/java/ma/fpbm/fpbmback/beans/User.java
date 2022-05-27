package ma.fpbm.fpbmback.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    private Long id;
    private String code;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hadVerifyEmail;

    private String avatar;
}
