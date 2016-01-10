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
public class Conseil4 extends Dresseur{
    
    public Conseil4 () {
        super();
    }
    
    public Conseil4 (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.conseil4, orientation);
        this.mobile = false;
    }
    
    public Conseil4 (Conseil4 dress) {
        super(dress);
    }
    
    public Conseil4 (Conseil4 dress, boolean changeNumId) {
        super(dress, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(600);
        pk.getAttributsExp().setAllNiveau(4);
        pk.getTypeExp().setAllNiveau(4);
        for (int i = 0 ; i < pk.getCap().nbCapacite() ; i++) {
            if (pk.getCap().getCapacite(i) != null) {
                pk.getCap().getCapacite(i).setNiv(4);
            }
        }
        this.getEquipe().ajouterPokemon(pk);
    }
    
}