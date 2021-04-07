package galerie.dao;

import galerie.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByUsername(String name);
}
