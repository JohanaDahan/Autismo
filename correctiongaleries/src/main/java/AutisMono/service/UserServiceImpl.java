package AutisMono.service;

import lombok.extern.slf4j.Slf4j;
import AutisMono.dao.RoleRepository;
import AutisMono.dao.UserRepository;
import AutisMono.entity.Medecin;
import AutisMono.entity.Patient;
import AutisMono.entity.Role;
import AutisMono.entity.Utilisateur;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    // Les infos du médecins sont définis dans 'application.properties')
    @Value("${medecin1.username}")
    private String medecin1Username;
    @Value("${medecin1.password}")
    private String medecin1Password;
    @Value("${medecin1.nom}")
    private String medecin1Nom;
    @Value("${medecin1.prenom}")
    private String medecin1Prenom;
    @Value("${medecin1.adresse}")
    private String medecin1Adresse;
    @Value("${medecin1.ville}")
    private String medecin1Ville;
    @Value("${medecin1.email}")
    private String medecin1Email;
    @Value("${medecin1.numtel}")
    private Integer medecin1Numtel;
    @Value("${medecin1.numrpps}")
    private String medecin1Numrpps;
    @Value("${medecin1.specialite}")
    private String medecin1Specialite;
    @Value("${medecin1.diplome}")
    private Integer medecin1Diplome;
    
    //Les infos du patient 1  sont définis dans 'application.properties')
    @Value("${patient1.username}")
    private String patient1Username;
    @Value("${patient1.password}")
    private String patient1Password;
    @Value("${patient1.nom}")
    private String patient1Nom;
    @Value("${patient1.prenom}")
    private String patient1Prenom;
    @Value("${patient1.adresse}")
    private String patient1Adresse;
    @Value("${patient1.ville}")
    private String patient1Ville;
    @Value("${patient1.email}")
    private String patient1Email;
    @Value("${patient1.numtel}")
    private Integer patient1Numtel;
    @Value("${patient1.numsecu}")
    private String patient1Numsecu;
    @Value("${patient1.datenaissance}")
    private Date patient1Datenaissance;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public void save(Utilisateur user) {
        // Par défaut on attribue le rôle 'ROLE_USER' aux nouveaux utilisateurs
        // Ce rôle est créé automatiquement au lancement de l'application
        Role normal = roleRepository.findByName("ROLE_USER").orElseThrow();
        // On crypte le mot de passe avant de l'enregistrer
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.getRoles().add(normal);
        userRepository.save(user);
    }

    @Override
    public Utilisateur findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void initializeRolesAndAdmin() {
        if (roleRepository.findByName("ROLE_ADMIN").isEmpty()) {
            log.info("Création des deux rôles et de l'administrateur");
            Role roleAdmin = new Role("ROLE_ADMIN");
            Role roleUser = new Role("ROLE_USER");
            roleRepository.save(roleAdmin);
            roleRepository.save(roleUser);
            Medecin firstAdmin = new Medecin(medecin1Username, medecin1Password, medecin1Nom,medecin1Prenom,medecin1Adresse, medecin1Ville,medecin1Email,medecin1Numtel,medecin1Numrpps,medecin1Specialite,medecin1Diplome);
            // On crypte le mot de passe avant de l'enregistrer
            firstAdmin.setPassword(bCryptPasswordEncoder.encode(firstAdmin.getPassword()));
            firstAdmin.getRoles().add(roleAdmin);
            userRepository.save(firstAdmin);
            
            Patient fisrtPatient = new Patient(patient1Username, patient1Password, patient1Nom, patient1Prenom, patient1Adresse, patient1Ville, patient1Email, patient1Numtel, patient1Numsecu, patient1Datenaissance);
            fisrtPatient.setPassword(bCryptPasswordEncoder.encode(fisrtPatient.getPassword()));
            fisrtPatient.getRoles().add(roleUser);
            userRepository.save(fisrtPatient);

        }
    }
}