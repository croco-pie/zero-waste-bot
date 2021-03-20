package persistence.entities.v1;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "material_codes", schema = "zero_waste")
public class MaterialCodes implements Serializable {

    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "code")
//    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private String code;

    public MaterialCodes() {}

    public MaterialCodes(String code) {
        this.code = code;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
