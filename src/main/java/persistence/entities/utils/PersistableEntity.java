package persistence.entities.utils;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

/**
 * Этот класс служит для генерации UUID для всех наследующих от него классов
 */

@Data
public abstract class PersistableEntity implements Serializable {

//    protected static final long UUID = 8L;

    @Id
    @GeneratedValue
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    public UUID id;
}
