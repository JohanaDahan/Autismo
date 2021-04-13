package AutisMono.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Personne extends Utilisateur {
    //@Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    //private Integer id;

    @NonNull
    private String nom;
    
    @NonNull
    private String prenom;

    @Column(unique=true)
    private String adresse;
     
     @NonNull
    private String ville;
     
    @Column(unique=true)
    private String numtel;
    
    //@Column(unique=true)
    //private String email; 
    
    //@NonNull
    //private String mdp;
    
    
}
