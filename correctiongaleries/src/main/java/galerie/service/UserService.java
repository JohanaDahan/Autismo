package galerie.service;

import AutisMono.entity.Utilisateur;

public interface UserService {
    void initializeRolesAndAdmin();

    void save(Utilisateur user);

    Utilisateur findByUserName(String username);
}