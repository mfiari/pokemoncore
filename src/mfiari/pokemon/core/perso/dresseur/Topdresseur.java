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
public class Topdresseur extends Dresseur{
    
    public Topdresseur () {
        super();
    }
    
    public Topdresseur (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.topdresseur, orientation);
    }
    
    public Topdresseur (Topdresseur topdresseur) {
        super(topdresseur);
    }
    
    public Topdresseur (Topdresseur topdresseur, boolean changeNumId) {
        super(topdresseur, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(200);
        pk.getAttributsExp().setAllNiveau(2);
        pk.getTypeExp().setAllNiveau(2);
        for (int i = 0 ; i < pk.getCap().nbCapacite() ; i++) {
            if (pk.getCap().getCapacite(i) != null) {
                pk.getCap().getCapacite(i).setNiv(2);
            }
        }
        this.getEquipe().ajouterPokemon(pk);
    }
    
}