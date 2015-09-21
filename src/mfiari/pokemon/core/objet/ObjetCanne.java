/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.core.objet;

import mfiari.pokemon.core.ville.Environnement;

/**
 *
 * @author mike
 */
public class ObjetCanne extends Objet_rare {
    
    private final Environnement environnement;
    
    public ObjetCanne (String nom, Environnement environnement) {
        super(nom);
        this.environnement = environnement;
    }

    public Environnement getEnvironnement() {
        return this.environnement;
    }
    
}
