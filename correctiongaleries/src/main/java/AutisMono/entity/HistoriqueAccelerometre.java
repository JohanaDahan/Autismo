/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutisMono.entity;
import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class HistoriqueAccelerometre {
        public ArrayList<accelerometre> HistoriqueAccelerometre;

    public HistoriqueAccelerometre(ArrayList<accelerometre> accelerometre) {
        this.HistoriqueAccelerometre = accelerometre;
    }

    @Override
    public String toString() {
        return "HistoriqueAccelerometre{" + "HistoriqueAccelerometre=" + HistoriqueAccelerometre + '}';
    }

    /**
     * Adds an fc to this historique
     *
     * @param fc the event to add
     */
    public void addAcc(accelerometre acc) {
        // TODO : implémenter cette méthode
        this.HistoriqueAccelerometre.add(acc);

    }
    
}
