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
public class HistoriqueFc {
    

    public ArrayList<fc> frequencecardiaque;

    public HistoriqueFc(ArrayList<fc> frequencecardiaque) {
        this.frequencecardiaque = frequencecardiaque;
    }

    @Override
    public String toString() {
        return "HistoriqueFc{" + "frequencecardiaque=" + frequencecardiaque + '}';
    }

    /**
     * Adds an fc to this historique
     *
     * @param fc the event to add
     */
     
    public void addfc(fc fc) {
        // TODO : implémenter cette méthode
        this.frequencecardiaque.add(fc);

    }
}

