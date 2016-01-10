/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import java.io.Serializable;
import mfiari.lib.game.objet.Objet;
import mfiari.pokemon.core.ville.Pays;

/**
 *
 * @author mike
 */
public class Badge extends Objet implements Serializable {
    
    private static final long serialVersionUID = 354054054060L;
    
    private Pays pays;
    
    public Badge () {
        
    }
    
    public Badge (String nom, Pays pays) {
        super(nom);
        this.pays = pays;
    }
    
    public Pays getPays () {
        return this.pays;
    }
}