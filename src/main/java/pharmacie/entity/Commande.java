package pharmacie.entity;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Embedded;

@Entity
@Getter @Setter @RequiredArgsConstructor @ToString
public class Commande {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
    private Integer numero;

    @NonNull
    private Date envoyeele;

    @PositiveOrZero
    private BigDecimal port;
    
    @PositiveOrZero
    private BigDecimal remise;

    @NonNull
    private Date saisiele;

    @NonNull
	@Column(unique=true, length = 5)
    private String dispensaire_code;

    @NonNull
	@Column(unique=true, length = 40)
    private String destinateur;

    @Embedded
    private AdressePostale adressePostale;
}
