package persistence.entities.v1;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.type.PostgresUUIDType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "waste", schema = "zero_waste")
public class Waste implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "code", unique = true)
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "code")
    private MaterialCodes code;

    @Column(name = "code_name")
    private String codeName;

    public Waste() {}

    public Waste(MaterialCodes code, String codeName) {
        this.code = code;
        this.codeName = codeName;
    }

    public void addCode() {
    }
}
