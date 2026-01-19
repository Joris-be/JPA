package pharmacie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NonNull;

@Embeddable
public class AdressePostale {

@NonNull
@Column(unique=true, length = 60)
private String adresse;

@NonNull
@Column(unique=true, length = 15)
private String ville;

@NonNull
@Column(unique=true, length = 15)
private String region;
    
@NonNull
@Column(unique=true, length = 10)
private String code_postal;

@NonNull
@Column(unique=true, length = 15)
private String pays;

}
