package guru.springframework.sfgpetclinic.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

	@Column(name = "name")
    private String name;
	
	@Override
    public String toString() {
        return name;
    }
	
	@Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

}
