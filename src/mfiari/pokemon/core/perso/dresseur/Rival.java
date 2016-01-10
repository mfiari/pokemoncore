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
public class Rival extends Dresseur{
    
    public Rival () {
        super();
    }
    
    public Rival (String nom, int numeroID, int positionX, int positionY, Endroit ville, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, Titre.rival, orientation);
    }
    
    public Rival (Rival rival) {
        super(rival);
    }
    
    public Rival (Rival rival, boolean changeNumId) {
        super(rival, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(400);
        pk.getAttributsExp().setAllNiveau(3);
        pk.getTypeExp().setAllNiveau(3);
        for (int i = 0 ; i < pk.getCap().nbCapacite() ; i++) {
            if (pk.getCap().getCapacite(i) != null) {
                pk.getCap().getCapacite(i).setNiv(3);
            }
        }
        this.getEquipe().ajouterPokemon(pk);
    }
    
}