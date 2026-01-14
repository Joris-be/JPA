package pharmacie.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Embedded;

@Entity
@Getter @Setter @RequiredArgsConstructor @ToString
public class Dispensaire {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
    private String code;
    
    @NonNull
    @Column(unique=true, length = 24)
    private String fax;

    @NonNull
    @Column(unique=true, length = 24)
    private String telephone;

    @NonNull
    @Column(unique=true, length = 30)
    private String contact;

    @NonNull
    @Column(unique=true, length = 30)
    private String fonction;

    @NonNull
    @Column(unique=true, length = 40)
    private String nom;
    
    @Embedded
    private AdressePostale adressePostale;
}
