package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Patient {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @NonNull
    private String nom;
    
    @NonNull
    private String prenom;
    
    @Column(unique=true)
    private String adresse;
    
    @Column(unique=true)
    private String numeroDeTel;
    
    @Column(unique=true)
    private String email; 
    
    @NonNull
    private String mdp;
    
    @NonNull @Column (unique=true)
    private String identifiant;
    
    
    /*@OneToMany(mappedBy = "client")
    @ToString.Exclude
    private List<Transaction> achats = new LinkedList<>();
    
    public float budgetArt(int annee) {
        float result=0.0f;
        for (Transaction achat : achats)
            if (achat.getVenduLe().getYear() == annee)
                result += achat.getPrixVente();
        return result;
        // Peut s'écrire en utilisant l'API Stream 
        // cf. https://www.baeldung.com/java-stream-filter-lambda
        /*
        return achats.stream()
                .filter( achat -> achat.getVenduLe().getYear() == annee) // On filtre sur l'annee
                .map(achat -> achat.getPrixVente()) // On garde le prix de vente
                .reduce(0f, Float::sum); // On additionne
       
    }*/   
}
