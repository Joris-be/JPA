package pharmacie.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class AdressePostale {
    @NotBlank
    private String rue;
    @NotBlank
    private String codePostal;
    @NotBlank
    private String ville;
    @NotBlank
    private String pays;
    @NotBlank
    private String region;
}
