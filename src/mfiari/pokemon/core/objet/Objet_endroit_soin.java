/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import mfiari.lib.game.objet.ObjetEndroitSoin;
import mfiari.lib.game.personnage.Personnage;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
public class Objet_endroit_soin extends ObjetEndroitSoin {

    public Objet_endroit_soin (Type_objet nom, int positionX, int positionY, String texte) {
        super(nom, positionX, positionY, texte);
    }
    
    public void soin (Pokemon pk) {
        pk.soin();
    }
    
    public void soin (Dresseur d) {
        for (int i = 0 ; i < d.getEquipe().lenght() ; i++) {
            if (d.getEquipe().getPokemon(i) != null) {
                d.getEquipe().getPokemon(i).soin();
            }
        }
    }

    @Override
    public void soin(Personnage d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}