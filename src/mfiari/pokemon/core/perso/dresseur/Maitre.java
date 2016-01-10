/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.dresseur;

import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.core.ville.Endroit;

/**
 *
 * @author mike
 */
public class Maitre extends Dresseur {
    
    private static final long serialVersionUID = 354054054065L;
    
    public Maitre () {
        super();
    }
    
    public Maitre (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.maitre, orientation);
    }
    
    public Maitre (Maitre maitre) {
        super(maitre);
    }
    
    public Maitre (Maitre maitre, boolean changeNumId) {
        super(maitre, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(900);
        pk.getAttributsExp().setAllNiveau(5);
        pk.getTypeExp().setAllNiveau(5);
        this.getEquipe().ajouterPokemon(pk);
    }
    
}